package jeu;

public class JeuCartes {
	//MOUVEMENTS
	public final static int AVANCE =0;
	public final static int RECULE =1;
	public final static int DROIT =2;
	public final static int GAUCHE =3;
	//VALEUR DE LA CARTE
	public final static int UN =0;
	public final static int DEUX =1;
	public final static int TROIS =2;
	public final static int QUATRE =3;
	public final static int CINQ =4;
	//VITESSE DE LA CARTE
	public final static int DIX =0;
	public final static int VINGT =1;
	public final static int TRENTE =2;
	public final static int QUARANTE =3;
	public final static int CINQUANTE =4;
	
	public final static String[] MOUVEMENTS = {"Avance","Recule","Droit","Gauche"};
	public final static String[] VALEURS = {"Un","Deux","Trois","Quatre","Cinq"};
	public final static String[] VITESSES = {"Dix","Vingt","Trente","Quarante","Cinquante"};
	
	private static int mouvement;
	
	private static int valeur;
	
	private static int vitesse;
	
	//Constructeur
	public JeuCartes (int mouvement, int valeur, int vitesse) {
		this.setMouvement(mouvement);
		this.setValeur(valeur);
		this.setVitesse(vitesse);
	}
	
	
	
	

	public static String[] getMouvements() {
		return MOUVEMENTS;
	}





	public static String[] getValeurs() {
		return VALEURS;
	}





	public static String[] getVitesses() {
		return VITESSES;
	}





	public static int getMouvement() {
		return mouvement;
	}

	public static int getValeur() {
		return valeur;
	}

	public static int getVitesse() {
		return vitesse;
	}

	public void setMouvement(int mouvement) {
		if (mouvement>= JeuCartes.AVANCE && mouvement<= JeuCartes.GAUCHE) {
			this.mouvement = mouvement;
		}
		
	}

	public void setValeur(int valeur) {
		if (valeur>= JeuCartes.UN && valeur<= JeuCartes.CINQ) {
			this.valeur = valeur;
		}
	}

	public void setVitesse(int vitesse) {
		if (vitesse>= JeuCartes.DIX && vitesse<= JeuCartes.CINQUANTE) {
			this.vitesse = vitesse;
		}
	}
	
	// Permet de savoir si 2 cartes on la même vitesse
	 
	public boolean aMemeVitesse(JeuCartes carte) {
		return (this.getVitesse() == carte.getVitesse());
	}
	
	
	//Compare deux cartes
	 
	public int compareTo(Object o) {
		int vitesseAutre = (((JeuCartes) o).getVitesse());
		int vitesseThis = this.getVitesse();
		int retour = 0;
		
		if (vitesseAutre == vitesseThis) retour = 0;
		if (vitesseAutre < vitesseThis) retour = 1;
		if (vitesseAutre > vitesseThis) retour = -1;
		
		return retour;
	}
	// Compare deux objets de type Carte
	public boolean equals(Object o) {
		return this.compareTo(o) == 0 ? true : false;		
	}
	
	public String toString() {
		return "Mouvement: "+ getMouvements()[mouvement]+ " Valeur: "+ getValeurs()[valeur]+" Vitesse: "+getVitesses()[vitesse];
	}


}
