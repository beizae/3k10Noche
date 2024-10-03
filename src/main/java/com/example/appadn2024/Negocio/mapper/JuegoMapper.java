/*

Te explico el código que compartiste:

1. Paquete e importaciones:

El código pertenece al paquete com.example.demoapp.business.mapper.
Importa las clases necesarias para trabajar con MapStruct y las entidades y DTOs involucrados:
JuegoResultadoDto, PersonaShortDto, Domicilio y Juego (entidades del dominio).
Mapper y Mapping (anotaciones de MapStruct).
2. Interfaz JuegoMapper:

Esta interfaz define los métodos de mapeo que se utilizarán para convertir entre entidades y DTOs.
Está anotada con @Mapper(componentModel = "spring"), lo que indica a MapStruct que genere la implementación de los métodos de mapeo y la integre a Spring como un componente.
3. Métodos de mapeo:

personaToPersonaFullDto(Juego persona): Mapea una entidad Juego a un DTO JuegoResultadoDto.
personaFullDtoToPersona(JuegoResultadoDto personaFullDto): Mapea un DTO JuegoResultadoDto a una entidad Juego.
personaToPersonaShortDto(Juego persona): Mapea una entidad Juego a un DTO PersonaShortDto. Tiene la anotación especial @Mapping(source = "domicilio.provincia", target = "provincia") para indicar que la propiedad provincia del DTO se debe mapear desde la propiedad provincia del objeto Domicilio dentro de la entidad Juego.
En resumen, este código define un Mapper que permite convertir entre entidades Juego y DTOs JuegoResultadoDto y PersonaShortDto. MapStruct se encargará de generar la implementación de los métodos de mapeo en tiempo de compilación, simplificando el proceso de conversión.

*/
package com.example.appadn2024.Negocio.mapper;

import com.example.appadn2024.Dominio.dtos.JuegoResultadoDto;
import com.example.appadn2024.Dominio.entities.Juego;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JuegoMapper {


    JuegoResultadoDto personaToPersonaFullDto(Juego juego);

    Juego personaFullDtoToPersona(JuegoResultadoDto personaFullDto);

}
