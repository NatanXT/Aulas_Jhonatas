package com.aulas.GerenciadorTarefas.Modelos;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String info;
    @OneToMany(fetch =FetchType.LAZY)
    private List<Tarefa> tarefa;


    public Projeto(Integer id, String nome, String info) {
        Id = id;
        this.nome = nome;
        this.info = info;
    }

    public Projeto() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(Id, projeto.Id) && Objects.equals(nome, projeto.nome) && Objects.equals(info, projeto.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, nome, info);
    }
}
