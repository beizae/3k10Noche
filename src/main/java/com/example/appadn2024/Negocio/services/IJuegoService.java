package com.example.appadn2024.Negocio.services;

import com.example.appadn2024.Dominio.entities.Juego;

public interface IJuegoService extends BaseService<Juego, Long> {

    Juego crear(Juego juego);


}
