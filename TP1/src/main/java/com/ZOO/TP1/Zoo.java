package com.ZOO.TP1;

import java.util.*;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbvisiteurMaxParSecteur;

    public Zoo(int visiteurs, int nbvisiteurMaxParSecteur) {
        this.visiteurs = visiteurs;
        this.secteursAnimaux = new ArrayList<Secteur>();
        this.nbvisiteurMaxParSecteur = nbvisiteurMaxParSecteur;
    }

    public void ajouterSecteur(TypeAnimal animal) {
        Secteur newSecteur = new Secteur(animal);
        secteursAnimaux.add(newSecteur);
    }

    public void nouveauVisiteur() throws LimiteVisiteurException{
        if (this.visiteurs + 1 > this.getLimitVisiteur()) {
            throw new LimiteVisiteurException("Limite visiteurs dépassée");
        } else {
            this.visiteurs = this.visiteurs + 1;
        }
    }

    public int getLimitVisiteur() {
        return(this.nbvisiteurMaxParSecteur * secteursAnimaux.size());
    }

    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        for (Secteur current_secteur : secteursAnimaux) {
            if (animal.getTypeAnimal().equals(current_secteur.obtenirType())) {
                current_secteur.ajouterAnimal(animal);
                return;
            }
        }
        throw new AnimalDansMauvaisSecteurException("Secteur introuvable pour ce TypeAnimal");
    }

    public int nombreAnimaux() {
        int nb_animaux = 0;
        for (Secteur current_secteur : secteursAnimaux) {
            nb_animaux = nb_animaux + current_secteur.getNombreAnimaux();
        }
        return nb_animaux;
    }

    //Getter Zone
    public int getNbVisiteurs() {
        return this.visiteurs;
    }

    public List<Secteur> getListSecteur(){
        return this.secteursAnimaux;
    }

}
