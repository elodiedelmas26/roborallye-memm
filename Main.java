package jeu;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static JFrame fenetre;
	public static Scene scene;
	
	
	public static void main(String[] args) throws IOException {
		
		fenetre = new JFrame("RoboRally");//création de la fenetre
		scene = new Scene();//création panneau
	
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//permettre de fermer le programme avec la croix rouge
		fenetre.setSize(1000,700); //dimension 
		fenetre.setLocationRelativeTo(null);//centrer la fenetre à l'écran
		fenetre.setResizable(false);//empeche de redimenssioné la fenetre
		fenetre.setAlwaysOnTop(true);//Toujours au dessus des autres fenetres quand on joue
		
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);//fenetre visible
		
		
		JButton bouton2 = new JButton("START");
		fenetre.getContentPane().add(bouton2);
		fenetre.setVisible(true);
		bouton2.setBounds(650, 500, 300, 50);
		
		
		

	}

}
