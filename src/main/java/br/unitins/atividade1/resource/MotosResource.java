package br.unitins.atividade1.resource;

import java.util.List;

import br.unitins.atividade1.model.Motos;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/motos")
public class MotosResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Motos> todasMotos() {
        return Motos.listAll();
    }

}
