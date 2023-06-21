package de.lcarilla.lauterbach.pong.services;

import de.lcarilla.lauterbach.pong.persistence.Game;
import de.lcarilla.lauterbach.pong.persistence.GameRepository;
import de.lcarilla.lauterbach.pong.persistence.Player;
import de.lcarilla.lauterbach.pong.persistence.PlayerRepository;
import de.lcarilla.lauterbach.pong.rest.dto.GameDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GameService {
    private PlayerRepository playerRepository;
    private GameRepository gameRepository;
    private ModelMapper modelMapper;
    @Transactional
    public Player postPlayer(GameDto gameDto){
        gameRepository.save(modelMapper.map(gameDto, Game.class));
        Optional<Player> playerOptional = playerRepository.findByName(gameDto.getName());
        if(playerOptional.isPresent()){
            Player playerDb = playerOptional.get();
            if(playerDb.getHighScore() < gameDto.getScore()){
                playerDb.setHighScore(gameDto.getScore());
            }
            return playerDb;
        }else{
            Player player = modelMapper.map(gameDto, Player.class);
            player.setHighScore(gameDto.getScore());
            return playerRepository.save(player);
        }
    }
    public Iterable<Player> getPlayers(){
        return playerRepository.findAll();
    }
    public Page<Game> getGames(){
        return gameRepository.findAll(PageRequest.of(0, 20, Sort.Direction.DESC, "id"));
    }
}
