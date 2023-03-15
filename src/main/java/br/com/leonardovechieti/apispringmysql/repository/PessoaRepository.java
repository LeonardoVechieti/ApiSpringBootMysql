package br.com.leonardovechieti.apispringmysql.repository;

import br.com.leonardovechieti.apispringmysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    List<Pessoa> findByNomeContains(String name);
}
