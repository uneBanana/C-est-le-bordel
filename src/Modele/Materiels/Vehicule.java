package Modele.Materiels;

/**
 * <b><big> Classe Vehicule </b></big>
 * 
 * <p> Cette classe représente le type de matériel Vehicule. Elle définit les attributs communs à tous les véhicules de l'entreprise.
 * </p>
 *
 * @author Angeline
 * 
 * @see Materiel
 * @see Moto
 * @see Voiture
 * 
 */

public class Vehicule extends Materiel{

    //attributs
    private int kilometrage;
    private String marque;
    private String modele;
    private int puissance;
    private Etat etat;
    private int vitesseMax;
    private int rapports;

    //constructeur
    public Vehicule(int identifiant, Statut statut, String type, int kilometrage, String marque, String modele,
            int puissance, Etat etat, int vitesseMax, int rapports) {
        super(statut, type);
        this.kilometrage = kilometrage;
        this.marque = marque;
        this.modele = modele;
        this.puissance = puissance;
        this.etat = etat;
        this.vitesseMax = vitesseMax;
        this.rapports = rapports;
    }

    //getter et setter
    public int getKilometrage() {
        return kilometrage;
    }
    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getPuissance() {
        return puissance;
    }
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    public int getVitesseMax() {
        return vitesseMax;
    }
    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    public int getRapports() {
        return rapports;
    }
    public void setRapports(int rapports) {
        this.rapports = rapports;
    }


    /*
    Ce sont les attributs qui seront affichés dans la liste déroulante
    permettant à l'utilisateur de sélectionner un objet.
    */
    @Override
    public String toString() {
        return marque + ", " + modele;
    }

}
