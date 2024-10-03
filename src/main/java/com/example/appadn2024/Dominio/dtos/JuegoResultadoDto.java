package com.example.appadn2024.Dominio.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JuegoResultadoDto {
    private Long id;
    private String adn;
    private Date fecha;
    private boolean esmarciano;

}
