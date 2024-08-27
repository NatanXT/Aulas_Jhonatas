package com.aulas.GerenciadorTarefas.Repository;

import com.aulas.GerenciadorTarefas.Modelos.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Integer> {

    List<Membro> findByNomeContaining(String nome);

}
