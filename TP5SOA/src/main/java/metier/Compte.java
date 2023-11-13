// Cette classe définit un modèle de compte bancaire avec des annotations JAXB pour la sérialisation XML.

package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private int code;
    private double solde;

    // Date de création du compte (annotée comme transitoire pour l'ignorer lors de la sérialisation XML)
    @XmlTransient
    private Date dateCreation;

    // Constructeur par défaut
    public Compte() {

    }

    // Constructeur avec paramètres
    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = date;

    }

    // Getter pour le code du compte
    public int getcode() {
        return this.code;
    }

    // Méthode toString pour l'affichage du compte
    public String toString() {
        return "code :" + this.code + " solde :" + solde + " date :" + this.dateCreation + "\n";
    }

    // Getters et setters pour les attributs du compte
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
