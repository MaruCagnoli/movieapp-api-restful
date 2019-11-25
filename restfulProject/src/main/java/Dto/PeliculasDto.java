package Dto;

import ava.restfulProject.model.Pelicula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PeliculasDto {

    private List <Pelicula> peliculas;
}
