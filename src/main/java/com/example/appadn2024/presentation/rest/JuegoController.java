package com.example.appadn2024.presentation.rest;

import com.example.appadn2024.Dominio.dtos.JuegoResultadoDto;
import com.example.appadn2024.Negocio.facade.IJuegoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Juegos")
public class JuegoController {

    @Autowired
    private IJuegoFacade juegoFacade;

    @GetMapping("/all/{id}")
    public ResponseEntity<JuegoResultadoDto> getAllDataById(@PathVariable Long id){
        return ResponseEntity.ok().body(juegoFacade.getAllDataById(id));
    }

    @PostMapping()
    public ResponseEntity<JuegoResultadoDto> crear(@RequestBody JuegoResultadoDto juegoResultadoDto){
        return ResponseEntity.ok().body(juegoFacade.crear(juegoResultadoDto));
    }

}
