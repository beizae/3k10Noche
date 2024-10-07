package com.example.appadn2024.Dominio.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Juego extends Base {

    private String adn;
    private Date fecha;
    private boolean esmarciano;

}
