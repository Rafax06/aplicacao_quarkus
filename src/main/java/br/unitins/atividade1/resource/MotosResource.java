package br.unitins.atividade1.resource;

import java.util.List;

import br.unitins.atividade1.model.Motos;
import br.unitins.atividade1.repository.MotosRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/motos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MotosResource {

    @Inject
    MotosRepository repository;

    // Inserir uma nova moto
    @POST
    @Transactional
    public Motos insert(Motos moto) {
        Motos novaMotos = new Motos();
        novaMotos.setNome(moto.getNome());
        novaMotos.setMarca(moto.getMarca());
        novaMotos.setCor(moto.getCor());

        repository.persist(novaMotos);

        return novaMotos;
    }

    // Atualiza as informações da moto que possuir o id informado
    @PUT
    @Path("/{id}")
    @Transactional
    public Motos update(@PathParam("id") Long id, Motos motoAtualizada) {
        Motos moto = repository.findById(id);
        moto.setNome(motoAtualizada.getNome());
        moto.setMarca(motoAtualizada.getMarca());
        moto.setCor(motoAtualizada.getCor());

        repository.persist(moto);

        return moto;
    }

    // Apaga a moto que possuir o id informado
    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        repository.deleteById(id);
    }

    // Listar todas as motos
    @GET
    public List<Motos> findAll() {
        return repository.listAll();
    }

    // Listar uma moto buscando pelo id
    @GET
    @Path("/{id}")
    public Motos findById(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    // Listar uma moto buscando pelo nome
    @GET
    @Path("/search/nome/{nome}")
    public List<Motos> findByNome(@PathParam("nome") String nome) {
        return repository.findByNome(nome);
    }
}