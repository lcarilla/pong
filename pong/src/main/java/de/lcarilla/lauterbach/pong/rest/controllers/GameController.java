package de.lcarilla.lauterbach.pong.rest.controllers;

import de.lcarilla.lauterbach.pong.persistence.Game;
import de.lcarilla.lauterbach.pong.persistence.Player;
import de.lcarilla.lauterbach.pong.rest.dto.GameDto;
import de.lcarilla.lauterbach.pong.services.GameService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/games")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class GameController {
    private GameService gameService;
    private ModelMapper modelMapper;
    @PostMapping(path = "/")
    public Player postPlayer(@RequestBody GameDto player){
        return gameService.postPlayer(player);
    }
    @GetMapping(path = "/")
    public Iterable<Player> getPlayers(){
        return gameService.getPlayers();
    }
    @GetMapping(path = "/recent")
    public List<Game> getGames(){
        return gameService.getGames().getContent();
    }
}
