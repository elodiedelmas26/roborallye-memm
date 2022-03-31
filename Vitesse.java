package jeu;

public enum Vitesse {
	DIX("dix",10),
	VINGT("vingt",20),
	TRENTE("trente",30),
	QUARANTE("quanrante",40),
	CINQUANTE("cinquante",50);
	
	private final String nom;
	private final int vitesse;
	
	private Vitesse(String nom, int vitesse) {
		this.nom = nom;
		this.vitesse = vitesse; 
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getVitesse() {
		return vitesse;
	}
	

}
