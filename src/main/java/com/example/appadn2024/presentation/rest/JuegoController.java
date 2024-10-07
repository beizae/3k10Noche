package com.example.appadn2024.presentation.rest;

import com.example.appadn2024.Dominio.dtos.JuegoResultadoDto;
import com.example.appadn2024.Dominio.entities.Juego;
import com.example.appadn2024.Negocio.facade.IJuegoFacade;
import com.example.appadn2024.Negocio.services.impl.JuegoServiceImp;
import com.example.appadn2024.presentation.rest.impl.BaseControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Juegos")
public class JuegoController extends BaseControllerImpl<Juego, JuegoServiceImp> {

    @Autowired
    private IJuegoFacade juegoFacade;

    //Crear pero no va a entrar por aca
   // @PostMapping()
  /*  public ResponseEntity<JuegoResultadoDto> crear(@RequestBody JuegoResultadoDto juegoResultadoDto){
        return ResponseEntity.ok().body(juegoFacade.crear(juegoResultadoDto));

    }*/


}
