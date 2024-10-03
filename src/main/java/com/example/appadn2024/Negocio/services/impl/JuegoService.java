package com.example.appadn2024.Negocio.services.impl;

import com.example.appadn2024.Dominio.entities.Juego;
import com.example.appadn2024.Negocio.services.IJuegoService;
import com.example.appadn2024.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoService implements IJuegoService {

    @Autowired
    private JuegoRepository juegoRepository;


    @Override
    public Juego crear(Juego juego) {

        return juegoRepository.save(juego);
    }

    @Override
    public Juego getById(Long id) {
        var juego = juegoRepository.findById(id);
        if(juego.isEmpty()) throw new RuntimeException("No hay ningun adn con el id " + id);
        return juego.get();
    }
}
