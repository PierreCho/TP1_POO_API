package com.ZOO.TP1;

public class Animal {
    private String nomAnimal;
    private TypeAnimal typeAnimal;

    public Animal(String nomAnimal, TypeAnimal typeAnimal) {
        this.nomAnimal = nomAnimal;
        this.typeAnimal = typeAnimal;
    }

    public String getNomAnimal() {
        return this.nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return this.typeAnimal;
    }
}
