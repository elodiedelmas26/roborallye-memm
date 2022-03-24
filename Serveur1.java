package code_serveur_client;
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
	        server = new ServerSocket(9876);
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
	            ServiceClient clientSock=new ServiceClient(server);
	            new Thread(clientSock).start();
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
	private ServerSocket clientSocket;
	
	public ServiceClient(ServerSocket server) {
		this.setClientSocket(server);
	}

	public static void main(String[]args) {
		try {
			try (ServerSocket server = new ServerSocket(port)) {
				System.out.println("Lancement du serveur : ");
				while(true) {
					ServiceClient t=new ServiceClient(server);
					t.start();
				}  
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run(Socket server) {
		traitement(server);
	}
	public void traitement(Socket server) {
		try {
			String msg="";
			System.out.println("Connexion avec le client : "+server.getInetAddress());
			
			BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
			PrintStream out=new PrintStream(server.getOutputStream());
			msg=in.readLine();
			out.println("Bonjour "+msg);
			server.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ServerSocket getClientSocket() {
		return clientSocket;
	}

	public void setClientSocket(ServerSocket clientSocket) {
		this.clientSocket = clientSocket;
	}
}

