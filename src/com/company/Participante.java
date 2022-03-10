package com.company;

public class Participante {
    int rg;
    String nome;
    String sobrenome;
    int idade;
    int celular;
    int numeroEmergencia;
    char grupoSanguineo;

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public char getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(char grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
