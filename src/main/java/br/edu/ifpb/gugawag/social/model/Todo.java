package br.edu.ifpb.gugawag.social.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    public void setCpf(String cpf) {
        this.description = cpf;
    }

    public Long getId() {
        return id;
    }

}
