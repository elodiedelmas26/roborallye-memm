package jeu;

public enum Mouvements {
	AVANCE("Avance"),
	RECULE("Recule"),
	DROITE("Droite"),
	GAUCHE("Gauche");
	
	private final String nom;
	private Mouvements (String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

}
