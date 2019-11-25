package ava.restfulProject.repository;

import ava.restfulProject.model.Pelicula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends MongoRepository  <Pelicula, String>{
}
