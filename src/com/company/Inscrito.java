package com.company;

public class Inscrito {
    int id;
    Categoria category;
    Participante person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public Participante getPerson() {
        return person;
    }

    public void setPerson(Participante person) {
        this.person = person;
    }
}
