package com.ZOO.TP1;

import java.util.*;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur; //(ENUM)
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal animal) {
        this.typeAnimauxDansSecteur = animal;
        this.animauxDansSecteur = new ArrayList<Animal>();
    }

    public void ajouterAnimal(Animal animal) {
        animauxDansSecteur.add(animal);
    }

    public int getNombreAnimaux() {
        return this.animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType() {
        return this.typeAnimauxDansSecteur;
    }
}
