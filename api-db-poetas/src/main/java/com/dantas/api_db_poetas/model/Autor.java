package com.dantas.api_db_poetas.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, unique = true, nullable = false)
    private String nome;

    @Column(length = 1500)
    private String bio;

    @OneToMany
    private List<Cordel> cordel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Cordel> getCordel() {
        return cordel;
    }

    public void setCordel(List<Cordel> cordel) {
        this.cordel = cordel;
    }
}
