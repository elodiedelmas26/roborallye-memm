package jeu;

import java.util.Collections;
import java.util.LinkedList;

//Représente le jeu de carte (100 cartes)
public class EnsembleCartes {
	private LinkedList<JeuCartes> tas;
	
	public EnsembleCartes() {
		tas = new LinkedList<>();
		int nbCartesNecessaires = 100;
		
		
		
		for (int i=0; i<nbCartesNecessaires;i++) {
			//On parcourt toutes les mouvements possibles, toutes les valeurs possibles, puis les vitesses
			//C'est à dire toute les cartes possibles, on les instancie et on
			// les ajoute au tas de cartes.
			for (int mouvement = JeuCartes.AVANCE ; mouvement<= JeuCartes.GAUCHE; mouvement++){
				for (int valeur = JeuCartes.UN; valeur<=JeuCartes.CINQ; valeur++) {
					for(int vitesse=JeuCartes.DIX; vitesse<=JeuCartes.CINQUANTE; vitesse++) {
						tas.add(new JeuCartes(mouvement, valeur, vitesse));
						
					}
					
				}
			}
		}
		
	}

}
