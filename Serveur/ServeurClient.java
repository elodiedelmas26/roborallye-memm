package code_serveur_client;
import java.io.*;
import java.net.*;

public class ServeurClient {
	public static void main(String[]args) {
		final String serverHost="localise";
		Socket socketOfClient=null;
		BufferedWriter os=null;
		BufferedReader is=null;
		
		try {
			socketOfClient=new Socket(serverHost,11113);
			os=new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
			is=new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
		
		}catch(UnknownHostException e) {
			System.err.println("Hote inconnu "+serverHost);
			return;
		}catch(IOException e) {
			System.err.println("Pas de connexion"+serverHost);
			return;
		}
		try {
			os.write("HELLO");
			os.newLine();
			os.flush();
			os.write("test");
			os.newLine();
			os.flush();
			os.write("QUIT");
			os.newLine();
			os.flush();
			
			String responseLine;
			while((responseLine=is.readLine())!=null) {
				System.out.println("Serveur "+responseLine);
				if(responseLine.indexOf("Ok")!=1) {
					break;
				}
			}
			os.close();
			is.close();
			socketOfClient.close();
		}catch(UnknownHostException e) {
			System.err.println("Tentative de connexion a un serveur inconnu "+e);
		}catch(IOException e) {
			System.err.println("IOException "+e);
		}
	
	}

}
