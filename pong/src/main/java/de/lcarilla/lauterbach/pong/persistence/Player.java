package de.lcarilla.lauterbach.pong.persistence;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long highScore;
}
