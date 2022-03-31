package code_serveur_client;

public class Main {
	public static void main(String[]args) {
		Serveur1 server=new Serveur1(2503);
		server.start();
	}

}
