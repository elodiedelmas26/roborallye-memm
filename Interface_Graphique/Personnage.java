package jeu;

import java.awt.Component;

public class Personnage extends Thread {
	private int largeur, hauteur;
	public static final int DROITE=0;
	public static final int GAUCHE = 1;
	public static final int REPOS = 10;
	protected Component zone;
	protected int silhouette = REPOS;
	protected int x;
	protected int y;
	protected int direction = DROITE;
	private int pas = 20;
	private int vitesse = 100;
	private int attente = 1000 * pas / vitesse;
	private boolean stoppe;
	private boolean suspendu;
	private boolean supprime;
	
	
	public Personnage(Component zone, int x, int y) {
		initialiser(zone, x, y);
	}
	
	public void initialiser(Component zone, int x, int y) { 
		this.zone = zone;
		this.x = x;
		this.y = y;
		
	}
	//par defaut, la direction vaut droite 
	public void changerDirection() {
		if (direction == DROITE) direction = GAUCHE;
		else direction = DROITE;
	}
	
	public int getAttente() {
		return attente;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public void setPas(int pas) {
		this.pas = pas;
		attente = 1000 * pas / vitesse;
	}
	
	public int getVitesse() {
		return vitesse;
	} 
	
	public boolean  estStoppe() {
		return stoppe;
	}
	
	public int getPas() {
		return pas;
	}
	public boolean  estSupprime() {
		return supprime;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setDirection(int direction) {
		if ((direction  !=  DROITE) && (direction != GAUCHE)) return;
		this.direction = direction;
	}
	
	public void setX(int x) {
		this.x = x;
		zone.repaint();
	} 
	public void setY(int y) {
		this.y = y;
		zone.repaint();
	}
	public void setVitesse(int vitesse) {
		if (vitesse <= 0) attente = Integer.MAX_VALUE;
		else {
			this.vitesse = vitesse;
			attente = 1000 * pas / vitesse;
			if (attente == 0) attente = 1;
		}
	} 
	public void demarrer() {
		if (!isAlive() && (!stoppe)) start();
	}
	public void faireMouvement(int prochaineSilhouette, 
			int prochainX, int prochainY) {
		silhouette = prochaineSilhouette;
		x = prochainX;
		y = prochainY;
		zone.repaint();
	}

	public void positionRepos() {
		faireMouvement(REPOS, x, y);
	} 
	
	
	synchronized public void supprimer() { 
		stoppe = true;
		supprime  = true;
		if (isAlive()) notify();
		zone.repaint();
	}
	
	




	
	
	
	
	
	

}
