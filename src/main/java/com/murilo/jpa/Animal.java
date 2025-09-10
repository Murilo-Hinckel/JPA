
package com.murilo.jpa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especie;
    private boolean Vivo;

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVivo() {
        return Vivo;
    }

    public void setVivo(boolean vivo) {
        Vivo = vivo;
    }

    public Animal(Long id, String nome, String especie, boolean Vivo) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.Vivo = Vivo;
    }
}

