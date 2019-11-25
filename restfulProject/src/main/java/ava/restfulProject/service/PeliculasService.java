package ava.restfulProject.service;

import Dto.PeliculasDto;
import ava.restfulProject.model.Pelicula;
import ava.restfulProject.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasService {

    @Autowired
    private PeliculasRepository peliculasRepository;

    public List<Pelicula> getAll(){
        return peliculasRepository.findAll();
    }
    public void addPelicula(Pelicula pelicula){
        peliculasRepository.save(pelicula);
    }
}
