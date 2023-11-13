package service;

import java.time.LocalDate; // Importation pour la classe LocalDate
import java.util.ArrayList;
import java.util.Date;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte; // Importation pour la classe Compte

// Classe de service pour les opérations bancaires de base
@WebService
public class BanqueService {

    // Convertit un montant en utilisant un taux de change fixe.
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 3.36;

    }

    // Récupère un compte bancaire en fonction du code fourni.
    @WebMethod
    public Compte getCompte(@WebParam(name = "codeCompte") int code) {
        return new Compte(code, 0, new Date());
    }

    // Récupère une liste de comptes bancaires.
    @WebMethod
    public ArrayList<Compte> getcomptes() {
        ArrayList<Compte> listecompte = new ArrayList<Compte>();
        listecompte.add(new Compte(10, 500, new Date()));
        listecompte.add(new Compte(11, 1500, new Date()));

        return listecompte;
    }


}

