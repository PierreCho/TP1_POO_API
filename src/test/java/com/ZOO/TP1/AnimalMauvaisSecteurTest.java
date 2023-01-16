package com.ZOO.TP1;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalMauvaisSecteurTest {
    @Test
    public void testAjoutAnimalSecteur() throws AnimalDansMauvaisSecteurException {
        Zoo zoo = new Zoo(0, 10);
        zoo.ajouterSecteur(TypeAnimal.LION);
        zoo.ajouterSecteur(TypeAnimal.OTARIE);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);
        zoo.ajouterSecteur(TypeAnimal.LEOPARD);
        zoo.ajouterSecteur(TypeAnimal.PERROQUET);

        assertNotNull(zoo);
        assertEquals(50, zoo.getLimitVisiteur());

        Animal animal1 = new Animal("Pilou", TypeAnimal.CHIEN);
        Animal animal2 = new Animal("Poisson", TypeAnimal.OTARIE);
        zoo.nouvelAnimal(animal1);
        zoo.nouvelAnimal(animal2);

        assertEquals(1, zoo.getListSecteur().stream()
                .filter(secteur -> secteur.obtenirType().equals(TypeAnimal.CHIEN))
                .findFirst().get().getNombreAnimaux()
        );

        assertEquals(1, zoo.getListSecteur().stream()
                .filter(secteur -> secteur.obtenirType().equals(TypeAnimal.OTARIE))
                .findFirst().get().getNombreAnimaux()
        );

    }
}
