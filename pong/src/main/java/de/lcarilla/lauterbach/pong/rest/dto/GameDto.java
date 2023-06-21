package de.lcarilla.lauterbach.pong.rest.dto;

import lombok.Data;

@Data
public class GameDto {
    private Long id;
    private String name;
    private Long score;
}
