package com.ZOO.TP1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NombreVisiteursMaxTest {
    @Test
    public void nombreVisiteurMax() throws LimiteVisiteurException {
        //Création du ozoo
        Zoo zoo = new Zoo(0, 3);
        zoo.ajouterSecteur(TypeAnimal.LION);
        zoo.ajouterSecteur(TypeAnimal.OTARIE);
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);

        assertNotNull(zoo); //Vérification création zoo
        assertEquals(12, zoo.getLimitVisiteur()); //Vérification limite visiteurs

        //Test avec 12 visiteurs
        for (int i=0; i<12; i++){
            zoo.nouveauVisiteur();
        }
        assertEquals(12, zoo.getNbVisiteurs());

        //Test de dépassement de la limite
        /*zoo.nouveauVisiteur();
        assertEquals(13, zoo.getNbVisiteurs());*/
    }
}
