package code_serveur_client;

import java.util.EventListener;

public class Evenements implements EventListener {
	public void received(Object p,Client1 Connection) {
		if(p instanceof AjoutConnexion) {
			AjoutConnexion packet = (AjoutConnexion)p;
			packet.id = Client1.getId();
			for(int i=0; i<Connexion.connections.size(); i++) {
				Client1 c = Connexion.connections.get(i);
				if(c != Connection) {
					c.sendObject(packet);
				}
			}
			
		}else if(p instanceof SuppressionConnexion) {
			SuppressionConnexion packet = (SuppressionConnexion)p;
			System.out.println("Connexion: " + packet.id + " a été déconnecté");
			Connexion.connections.get(packet.id).close();
			Connexion.connections.remove(packet.id);
		}
	}

}


