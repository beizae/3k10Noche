package com.example.appadn2024.Negocio.services.impl;

import com.example.appadn2024.Dominio.entities.Juego;
import com.example.appadn2024.Negocio.services.IJuegoService;
import com.example.appadn2024.repositories.BaseRepository;
import com.example.appadn2024.repositories.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoServiceImp extends BaseServiceImpl<Juego, Long> implements IJuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    public JuegoServiceImp(BaseRepository<Juego, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public Juego crear(Juego juego) {

        return juegoRepository.save(juego);
    }




}
