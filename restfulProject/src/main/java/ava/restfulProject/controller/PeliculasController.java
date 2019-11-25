package ava.restfulProject.controller;

import Dto.PeliculasDto;
import ava.restfulProject.model.Pelicula;
import ava.restfulProject.service.PeliculasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("pelicula")
public class PeliculasController {

    @Autowired
    private PeliculasService peliculasService;

    @GetMapping("")
    public ResponseEntity<PeliculasDto> getAll(){
        List<Pelicula> peliculas = peliculasService.getAll();

        return ResponseEntity.ok().body(PeliculasDto.builder()
                .peliculas(peliculas)
                .build());
    }

    @PostMapping("")
    public void addPelicula(@RequestBody Pelicula pelicula){

        peliculasService.addPelicula(pelicula);
    }


}
