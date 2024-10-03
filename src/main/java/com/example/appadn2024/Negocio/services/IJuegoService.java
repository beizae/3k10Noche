package com.example.appadn2024.Negocio.services;

import com.example.appadn2024.Dominio.entities.Juego;

public interface IJuegoService {

    Juego crear(Juego juego);
    Juego getById(Long id);
}
