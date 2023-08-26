package br.unitins.atividade1.repository;

import java.util.List;

import br.unitins.atividade1.model.Motos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MotosRepository implements PanacheRepository<Motos> {
    public List<Motos> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%" + nome + "%").list();
    }
}
