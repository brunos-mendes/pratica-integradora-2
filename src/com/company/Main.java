package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void create(List<Inscrito> inscritos, Participante participante, Categoria categoria) {
        int newId = inscritos.get(inscritos.size() - 1).getId() + 1;
        Inscrito newInscrito = new Inscrito();
        newInscrito.setId(newId);
        newInscrito.setPerson(participante);
        newInscrito.setCategory(categoria);
        inscritos.add(newInscrito);
    }

    static void delete(List<Inscrito> inscritos, int id) {
        for (int i = 0; i < inscritos.size() ; i++) {
            if (inscritos.get(i).getId() == id) {
                inscritos.remove(i);
            }
        }
    }

    static List<Inscrito> listCategory(List<Inscrito> inscritos, String category) {
        List<Inscrito> nessaCategoria = new ArrayList<Inscrito>();
        for (Inscrito inscrito : inscritos) {
            if (inscrito.getCategory().getName().equals(category)) {
                nessaCategoria.add(inscrito);
            }
        }
        return nessaCategoria;
    }

    public static void main(String[] args) {
        Categoria circuitoPequeno = new Categoria();
        Categoria circuitoMedio = new Categoria();
        Categoria circuitoAvancado = new Categoria();
        ArrayList<String> challenge1 = new ArrayList<>();
        challenge1.add("selva");
        challenge1.add("riachos");
        ArrayList<String> challenge2 = new ArrayList<>(challenge1);
        challenge2.add("lama");
        ArrayList<String> challenge3 = new ArrayList<>(challenge2);;
        challenge3.add("escalada");

        List<Inscrito> inscritos = new ArrayList<Inscrito>();

        circuitoPequeno.setName("Circuito Pequeno");
        circuitoPequeno.setDistance(2);
        circuitoPequeno.setChallenge(challenge1);
        circuitoPequeno.setPrice_1(1300);
        circuitoPequeno.setPrice_2(1500);

        circuitoMedio.setName("Circuito Medio");
        circuitoMedio.setDistance(5);
        circuitoMedio.setChallenge(challenge2);
        circuitoMedio.setPrice_1(2000);
        circuitoMedio.setPrice_2(2300);

        circuitoAvancado.setName("Circuito Avancado");
        circuitoAvancado.setDistance(10);
        circuitoAvancado.setChallenge(challenge3);
        circuitoAvancado.setPrice_1(0);
        circuitoAvancado.setPrice_2(2800);

        System.out.println(circuitoPequeno);
        System.out.println(challenge2);
        System.out.println(challenge3);

   }
}
