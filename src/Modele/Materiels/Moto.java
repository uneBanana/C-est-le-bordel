package Modele.Materiels;

/**
 * <b><big> Classe Moto </b></big>
 * 
 * <p> Cette classe représente le matériel moto. Elle hérite de la classe Vehicule, qui est son type de matériel.
 * </p>
 * 
 * @author Angeline
 * 
 * @see Materiel
 * @see Vehicule
 * 
 */

public class Moto extends Vehicule{

    //attribut
    private int cylindres;

    //constructeur
    public Moto(int identifiant, Statut statut, String type, int kilometrage, String marque, String modele,
            int puissance, Etat etat, int vitesseMax, int rapports, int cylindres) {
        super(identifiant, statut, type, kilometrage, marque, modele, puissance, etat, vitesseMax, rapports);
        this.cylindres = cylindres;
    }

    //getter et setter
    public int getCylindres() {
        return cylindres;
    }
    public void setCylindres(int cylindres) {
        this.cylindres = cylindres;
    }
    
}
