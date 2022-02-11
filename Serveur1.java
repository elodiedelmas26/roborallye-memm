package RobotRallye;

import java.io.*;
import java.io.BufferedWriter;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class Serveur1 {
	
public static void main(String args []) {
	
	ServerSocket listener = null;
	String line;
	BufferedReader is;
	BufferedWriter os;
	Socket socketOfServer = null;
	
	// essaie ouverture d'un serveur 
	try {
		listener = new ServerSocket(11111);
	}
	catch(IOException e) {
		System.out.println(e);
		System.exit(1);
	}
	
	try {
		System.out.println("En attente d'un joueur... ");
		socketOfServer = listener.accept();
		System.out.println("Joueur accepté ! ");
		is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
		os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
		
		while(true) {
			line = is.readLine();
			os.write(">>"+line);
			os.newLine();
			os.flush();
		if(line.equals("QUIT")) {
			os.write(">> OK" );
			os.newLine();
			os.flush();
			break;
		}
			
		}
		
	} catch(IOException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	System.out.println("Stop!");
	
}}
	


