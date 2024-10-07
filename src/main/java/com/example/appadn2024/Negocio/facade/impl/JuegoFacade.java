package com.example.appadn2024.Negocio.facade.impl;

import com.example.appadn2024.Dominio.dtos.JuegoResultadoDto;
import com.example.appadn2024.Negocio.facade.IJuegoFacade;
import com.example.appadn2024.Negocio.mapper.JuegoMapper;
import com.example.appadn2024.Negocio.services.IJuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoFacade implements IJuegoFacade {

    @Autowired
    private IJuegoService juegoService;
    @Autowired
    private JuegoMapper juegoMapper;


    @Override
    public JuegoResultadoDto crear(JuegoResultadoDto nuevoJuegoDto) {
        //Convertir el Dto en una Entidad
        var newjuego = juegoMapper.JuegoResultadoDtoToJuego(nuevoJuegoDto);
        //Guardar la entidad
        var juegoGuardado = juegoService.crear(newjuego);
        //Devolver la nueva entida convertida en Dto
        return juegoMapper.juegoToJuegoResultado(juegoGuardado);
    }


}
