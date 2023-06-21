package de.lcarilla.lauterbach.pong.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
