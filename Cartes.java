package jeu;

public class Cartes {
	//Les variables
	private Mouvements mouvements;
	private Valeur valeur;
	private Vitesse vitesse;
	private boolean affiché;
	
	//Constructeur
	public Cartes(Mouvements mouvements, Valeur valeur, Vitesse vitesse) {
		this.vitesse=vitesse;
		this.mouvements=mouvements;
		this.valeur=valeur;
		affiché = false;
	}
	
	//Getters

	public Mouvements getMouvements() {
		return mouvements;
	}

	

	public Valeur getValeur() {
		return valeur;
	}
	
	public Vitesse getVitesse() {
		return vitesse;
	}

	

	public boolean isAffiché() {
		return affiché;
	}
	
	public void tourner() {
		affiché=!affiché;
	}
	
	public String toString() {
		return valeur.getNom()+" "+ mouvements.getNom()+" "+vitesse.getNom();
	}
	
	
	

}
