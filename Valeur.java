package jeu;

public enum Valeur {
	UN("Un",1),
	DEUX("Deux",2),
	TROIS("Trois",3),
	QUATRE("Quatre",4),
	CINQ("Cinq",5);
	
	private final String nom;
	private final int valeur;
	
	private Valeur(String nom, int valeur) {
		this.nom = nom;
		this.valeur = valeur; 
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getValeur() {
		return valeur;
	}

}
