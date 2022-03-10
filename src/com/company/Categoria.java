package com.company;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    String name;
    int distance;
    ArrayList<String> challenge;
    int price_1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int price_2;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public ArrayList<String> getChallenge() {
        return challenge;
    }

    public void setChallenge(ArrayList<String> challenge) {
        this.challenge = challenge;
    }

    public int getPrice_1() {
        return price_1;
    }

    public void setPrice_1(int price_1) {
        this.price_1 = price_1;
    }

    public int getPrice_2() {
        return price_2;
    }

    public void setPrice_2(int price_2) {
        this.price_2 = price_2;
    }
}
