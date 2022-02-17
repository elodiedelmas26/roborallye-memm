package RobotRallye;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Serveur1{
	 public Serveur1() throws IOException {
		super();
	}

	private static ServerSocket server;
	    private static int port = 9876 ;
	    
	    public static void main(String args[]) throws IOException, ClassNotFoundException{
	        server = new ServerSocket();
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

		public static int getPort() {
			return port;
		}

		public static void setPort(int port) {
			Serveur1.port = port;
		}

}
class ServiceClient extends Thread{
	
	final static int port=9876;
	private Socket socket;
	
	public ServiceClient(Socket socketClient) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[]args) {
		try {
			try (ServerSocket server = new ServerSocket(port)) {
				System.out.println("Lancement du serveur : ");
				while(true) {
					Socket socketClient=server.accept();
					ServiceClient t=new ServiceClient(socketClient);
					t.start();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		traitement();
	}
	public void traitement() {
		try {
			String msg="";
			System.out.println("Connexion avec le client : "+socket.getInetAddress());
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintStream out=new PrintStream(socket.getOutputStream());
			msg=in.readLine();
			out.println("Bonjour "+msg);
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
