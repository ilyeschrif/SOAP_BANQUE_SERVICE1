package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

// Cette classe représente le serveur qui publie le service web BanqueService.


public class ServeurJWS {
    public static void main(String [] args) {

        // Définir l'URL à laquelle le service web sera publié.
        String url = " http://localhost:8084/";

        // Publier le service web à l'URL spécifiée.
        Endpoint.publish(url, new BanqueService());


    }
}
