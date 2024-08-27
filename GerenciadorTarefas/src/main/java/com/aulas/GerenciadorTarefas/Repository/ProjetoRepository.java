package com.aulas.GerenciadorTarefas.Repository;

import com.aulas.GerenciadorTarefas.Modelos.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {


}
