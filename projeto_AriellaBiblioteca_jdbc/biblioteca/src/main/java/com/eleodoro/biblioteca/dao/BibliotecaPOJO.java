package com.eleodoro.biblioteca.dao;

public class BibliotecaPOJO {
  
    private String nome;
    private String email;
    private int telefone;

    public BibliotecaPOJO () {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}