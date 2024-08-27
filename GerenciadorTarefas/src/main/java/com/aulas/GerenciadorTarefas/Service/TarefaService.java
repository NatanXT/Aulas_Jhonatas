package com.aulas.GerenciadorTarefas.Service;

import com.aulas.GerenciadorTarefas.Modelos.Membro;
import com.aulas.GerenciadorTarefas.Modelos.Tarefa;
import com.aulas.GerenciadorTarefas.Repository.MembroRepository;
import com.aulas.GerenciadorTarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;
    public List<Tarefa> findAll(){
        return tarefaRepository.findAll();
    }
    public Tarefa findById(Integer Id){
        return this.tarefaRepository.findById(Id).orElseThrow();
    }

    public Tarefa save(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }
    public void delete(Tarefa tarefa){
        this.tarefaRepository.delete(tarefa);
    }
    public Tarefa update(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }

    public List<Membro> findByName(String nome){
        return this.tarefaRepository.findByNameTarefa(nome);
    }
}
