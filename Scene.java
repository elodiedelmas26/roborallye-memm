package jeu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel{
	
	//VARIABLE
	private ImageIcon icoCaseGrise;
	private Image imgCaseGrise;
	
	
	private ImageIcon icoDrapeau;
	private Image imgDrapeau;
	
	private ImageIcon icoBas;
	private Image imgBas;
	
	private ImageIcon icoDepart;
	private Image imgDepart;
	
	private ImageIcon icoDroit;
	private Image imgDroit;
	
	private ImageIcon icoGauche;
	private Image imgGauche;
	
	private ImageIcon icoHaut;
	private Image imgHaut;
	
	private ImageIcon icoMur;
	private Image imgMur;
	
	
	private ImageIcon icoTrou;
	private Image imgTrou;
	
	private ImageIcon icoMario;
	private Image imgMario;
	
	
	//CONSTRUCTEUR
	public Scene() {
		
		super();
		this.icoCaseGrise = new ImageIcon(getClass().getResource("/images/CaseGrise.png"));
		this.imgCaseGrise = this.icoCaseGrise.getImage();
		
		this.icoTrou = new ImageIcon(getClass().getResource("/images/trou.png"));
		this.imgTrou = this.icoTrou.getImage();
		
		this.icoMur = new ImageIcon(getClass().getResource("/images/mur.png"));
		this.imgMur = this.icoMur.getImage();
		
		this.icoHaut = new ImageIcon(getClass().getResource("/images/haut.png"));
		this.imgHaut = this.icoHaut.getImage();
		
		this.icoGauche = new ImageIcon(getClass().getResource("/images/gauche.png"));
		this.imgGauche = this.icoGauche.getImage();
		
		this.icoDroit = new ImageIcon(getClass().getResource("/images/droit.png"));
		this.imgDroit = this.icoDroit.getImage();
		
		this.icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.icoDepart.getImage();
		
		this.icoBas = new ImageIcon(getClass().getResource("/images/Bas.png"));
		this.imgBas = this.icoBas.getImage();
		
		this.icoDrapeau = new ImageIcon(getClass().getResource("/images/drapeau.png"));
		this.imgDrapeau = this.icoDrapeau.getImage();
		
		icoMario = new ImageIcon(getClass().getResource("/images/Mario.png"));
		this.imgMario = this.icoMario.getImage();
		
		
	
	}
	
	// METHODES
	public void paintComponent(Graphics g) {
		//1ERE colonne
		g.drawImage(this.imgCaseGrise, 0, 50, null);
		g.drawImage(this.imgTrou, 0, 0, null);
		g.drawImage(this.imgCaseGrise, 0, 100, null);
		g.drawImage(this.imgCaseGrise, 0, 150, null);
		g.drawImage(this.imgCaseGrise, 0, 200, null);
		g.drawImage(this.imgMur, 0, 250, null);
		g.drawImage(this.imgCaseGrise, 0, 300, null);
		g.drawImage(this.imgCaseGrise, 0, 350, null);
		g.drawImage(this.imgCaseGrise, 0, 400, null);
		g.drawImage(this.imgCaseGrise, 0, 450, null);
		g.drawImage(this.imgDroit, 0, 500, null);
		g.drawImage(this.imgCaseGrise, 0, 550, null);
		//2eme 
		g.drawImage(this.imgCaseGrise, 50, 0, null);
		g.drawImage(this.imgCaseGrise, 50, 50, null);
		g.drawImage(this.imgGauche, 50, 100, null);
		g.drawImage(this.imgCaseGrise, 50, 150, null);
		g.drawImage(this.imgCaseGrise, 50, 200, null);
		g.drawImage(this.imgCaseGrise, 50, 250, null);
		g.drawImage(this.imgCaseGrise, 50,300, null);
		g.drawImage(this.imgCaseGrise, 50, 350, null);
		g.drawImage(this.imgCaseGrise, 50, 400, null);
		g.drawImage(this.imgDrapeau, 50, 450, null);
		g.drawImage(this.imgDroit, 50, 500, null);
		g.drawImage(this.imgCaseGrise, 50, 550, null);
		//3eme
		g.drawImage(this.imgCaseGrise, 100, 0, null);
		g.drawImage(this.imgCaseGrise, 100, 50, null);
		g.drawImage(this.imgGauche, 100, 100, null);
		g.drawImage(this.imgCaseGrise, 100, 150, null);
		g.drawImage(this.imgCaseGrise, 100, 200, null);
		g.drawImage(this.imgTrou, 100, 250, null);
		g.drawImage(this.imgCaseGrise, 100, 300, null);
		g.drawImage(this.imgCaseGrise, 100, 350, null);
		g.drawImage(this.imgCaseGrise, 100, 400, null);
		g.drawImage(this.imgHaut, 100, 450, null);
		g.drawImage(this.imgHaut, 100, 500, null);
		g.drawImage(this.imgCaseGrise, 100, 550, null);
		//4eme
		g.drawImage(this.imgBas, 150, 0, null);
		g.drawImage(this.imgBas, 150, 50, null);
		g.drawImage(this.imgGauche, 150, 100, null);
		g.drawImage(this.imgCaseGrise, 150, 150, null);
		g.drawImage(this.imgCaseGrise, 150, 200, null);
		g.drawImage(this.imgMur, 150, 250, null);
		g.drawImage(this.imgCaseGrise, 150, 300, null);
		g.drawImage(this.imgCaseGrise, 150, 350, null);
		g.drawImage(this.imgCaseGrise, 150, 400, null);
		g.drawImage(this.imgCaseGrise, 150, 450, null);
		g.drawImage(this.imgCaseGrise, 150, 500, null);
		g.drawImage(this.imgCaseGrise, 150, 550, null);
		//5eme
		g.drawImage(this.imgCaseGrise, 200, 0, null);
		g.drawImage(this.imgCaseGrise, 200, 50, null);
		g.drawImage(this.imgCaseGrise, 200, 100, null);
		g.drawImage(this.imgCaseGrise, 200, 150, null);
		g.drawImage(this.imgCaseGrise, 200, 200, null);
		g.drawImage(this.imgCaseGrise, 200, 250, null);
		g.drawImage(this.imgCaseGrise, 200, 300, null);
		g.drawImage(this.imgCaseGrise, 200, 350, null);
		g.drawImage(this.imgCaseGrise, 200, 400, null);
		g.drawImage(this.imgCaseGrise, 200, 450, null);
		g.drawImage(this.imgCaseGrise, 200, 500, null);
		g.drawImage(this.imgCaseGrise, 200, 550, null);
		//6eme
		g.drawImage(this.imgCaseGrise, 250, 0, null);
		g.drawImage(this.imgCaseGrise, 250, 50, null);
		g.drawImage(this.imgTrou, 250, 100, null);
		g.drawImage(this.imgCaseGrise, 250, 150, null);
		g.drawImage(this.imgCaseGrise, 250, 200, null);
		g.drawImage(this.imgCaseGrise, 250, 250, null);
		g.drawImage(this.imgCaseGrise, 250, 300, null);
		g.drawImage(this.imgCaseGrise, 250, 350, null);
		g.drawImage(this.imgCaseGrise, 250, 400, null);
		g.drawImage(this.imgCaseGrise, 250, 450, null);
		g.drawImage(this.imgCaseGrise, 250, 500, null);
		g.drawImage(this.imgDepart, 250, 550, null);
		//7eme
		g.drawImage(this.imgMur, 300, 0, null);
		g.drawImage(this.imgCaseGrise, 300, 50, null);
		g.drawImage(this.imgCaseGrise, 300, 100, null);
		g.drawImage(this.imgCaseGrise, 300, 150, null);
		g.drawImage(this.imgCaseGrise, 300, 200, null);
		g.drawImage(this.imgCaseGrise, 300, 250, null);
		g.drawImage(this.imgCaseGrise, 300, 300, null);
		g.drawImage(this.imgCaseGrise, 300, 350, null);
		g.drawImage(this.imgCaseGrise, 300, 400, null);
		g.drawImage(this.imgCaseGrise, 300, 450, null);
		g.drawImage(this.imgCaseGrise, 300, 500, null);
		g.drawImage(this.imgCaseGrise, 300, 550, null);
		//8eme
		g.drawImage(this.imgCaseGrise, 350, 0, null);
		g.drawImage(this.imgCaseGrise, 350, 50, null);
		g.drawImage(this.imgCaseGrise, 350, 100, null);
		g.drawImage(this.imgHaut, 350, 150, null);
		g.drawImage(this.imgHaut, 350, 200, null);
		g.drawImage(this.imgHaut, 350, 250, null);
		g.drawImage(this.imgHaut, 350, 300, null);
		g.drawImage(this.imgCaseGrise, 350, 350, null);
		g.drawImage(this.imgTrou, 350, 400, null);
		g.drawImage(this.imgCaseGrise, 350, 450, null);
		g.drawImage(this.imgCaseGrise, 350, 500, null);
		g.drawImage(this.imgCaseGrise, 350, 550, null);
		//9eme
		g.drawImage(this.imgCaseGrise, 400, 0, null);
		g.drawImage(this.imgCaseGrise, 400, 50, null);
		g.drawImage(this.imgCaseGrise, 400, 100, null);
		g.drawImage(this.imgCaseGrise, 400, 150, null);
		g.drawImage(this.imgCaseGrise, 400, 200, null);
		g.drawImage(this.imgCaseGrise, 400, 250, null);
		g.drawImage(this.imgGauche, 400, 300, null);
		g.drawImage(this.imgCaseGrise, 400, 350, null);
		g.drawImage(this.imgCaseGrise, 400, 400, null);
		g.drawImage(this.imgCaseGrise, 400, 450, null);
		g.drawImage(this.imgCaseGrise, 400, 500, null);
		g.drawImage(this.imgCaseGrise, 400, 550, null);
		//10eme
		g.drawImage(this.imgCaseGrise, 450, 0, null);
		g.drawImage(this.imgDrapeau, 450, 50, null);
		g.drawImage(this.imgCaseGrise, 450, 100, null);
		g.drawImage(this.imgCaseGrise, 450, 150, null);
		g.drawImage(this.imgTrou, 450, 200, null);
		g.drawImage(this.imgCaseGrise, 450, 250, null);
		g.drawImage(this.imgGauche, 450, 300, null);
		g.drawImage(this.imgHaut, 450, 350, null);
		g.drawImage(this.imgHaut, 450, 400, null);
		g.drawImage(this.imgHaut, 450, 450, null);
		g.drawImage(this.imgHaut, 450, 500, null);
		g.drawImage(this.imgHaut, 450, 550, null);
		//11eme
		g.drawImage(this.imgCaseGrise, 500, 0, null);
		g.drawImage(this.imgCaseGrise, 500, 50, null);
		g.drawImage(this.imgCaseGrise, 500, 100, null);
		g.drawImage(this.imgCaseGrise, 500, 150, null);
		g.drawImage(this.imgCaseGrise, 500, 200, null);
		g.drawImage(this.imgCaseGrise, 500, 250, null);
		g.drawImage(this.imgCaseGrise, 500, 300, null);
		g.drawImage(this.imgCaseGrise, 500, 350, null);
		g.drawImage(this.imgTrou, 500, 400, null);
		g.drawImage(this.imgCaseGrise, 500, 450, null);
		g.drawImage(this.imgCaseGrise, 500, 500, null);
		g.drawImage(this.imgCaseGrise, 500, 550, null);
		//12eme
		g.drawImage(this.imgCaseGrise, 550, 0, null);
		g.drawImage(this.imgMur, 550, 50, null);
		g.drawImage(this.imgCaseGrise, 550, 100, null);
		g.drawImage(this.imgCaseGrise, 550, 150, null);
		g.drawImage(this.imgCaseGrise, 550, 200, null);
		g.drawImage(this.imgCaseGrise, 550, 250, null);
		g.drawImage(this.imgMur, 550, 300, null);
		g.drawImage(this.imgCaseGrise, 550, 350, null);
		g.drawImage(this.imgCaseGrise, 550, 400, null);
		g.drawImage(this.imgCaseGrise, 550, 450, null);
		g.drawImage(this.imgCaseGrise, 550, 500, null);
		g.drawImage(this.imgCaseGrise, 550, 550, null);
		
		g.drawImage(imgMario,0,0,null);
		
	}
	
	
	

}
	

