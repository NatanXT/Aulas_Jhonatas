package com.aulas.GerenciadorTarefas.Repository;

import com.aulas.GerenciadorTarefas.Modelos.Membro;
import com.aulas.GerenciadorTarefas.Modelos.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {


    List<Membro> findByNameTarefa(String nome);
}
