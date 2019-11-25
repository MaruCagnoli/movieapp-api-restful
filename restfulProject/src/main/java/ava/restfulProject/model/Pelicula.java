package ava.restfulProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "todasLasPeliculas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Pelicula {
    @Id
    private String id;

    private String titulo;
    private String descripcion;
    private String duracion;

}
