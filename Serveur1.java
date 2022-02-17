package RobotRallye;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Serveur1 {
	 private static ServerSocket server;
	    private static int port = 9876;
	    
	    public static void main(String args[]) throws IOException, ClassNotFoundException{
	        server = new ServerSocket(port);
	        while(true){
	            System.out.println("En attente de la requete du client :");
	            Socket socket = server.accept();
	            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
	            String message = (String) ois.readObject();
	            System.out.println("Message Recu: " + message);
	            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
	            oos.writeObject("Bonjour Client ! "+message);
	            ois.close();
	            oos.close();
	            socket.close();
	            if(message.equalsIgnoreCase("exit")) break;
	        }
	        System.out.println("Arrêt du serveur !");
	        server.close();
	    }
	    
	}


	


