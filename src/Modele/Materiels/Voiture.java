package Modele.Materiels;

/** * 
 * <b><big> Classe Voiture </b></big>
 * 
 * <p>
 * Cette classe représente le matériel voiture. Elle hérite de la classe Vehicule, qui est son type de matériel.
 * </p>
 * 
 * @author Angeline 
 * 
 * @see Materiel
 * @see Vehicule
 * 
 */

public class Voiture extends Vehicule{

    //attributs
    private int nbPlaces;

    //constructeur
    public Voiture(int identifiant, Statut statut, String type, int kilometrage, String marque, String modele,
            int puissance, Etat etat, int vitesseMax, int rapports, int nbPlaces) {
        super(identifiant, statut, type, kilometrage, marque, modele, puissance, etat, vitesseMax, rapports);
        this.nbPlaces = nbPlaces;
    }

    //getter et setter  
    public int getNbPlaces() {
        return nbPlaces;
    }
    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }  
    
}
