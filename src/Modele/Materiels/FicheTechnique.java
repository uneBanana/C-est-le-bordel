package Modele.Materiels;

/**
 * <b><big> Classe FicheTechnique </b></big>
 * 
 * <p> Cette classe définit les différents champs présents dans la fiche technique des ordinateurs de l'entreprise :
 * <ul>
 * <li>le processeur </li>
 * <li>la carte graphique </li>
 * <li>la taille de l'écran (la diagonale en cm)</li>
 * </ul>
 * </p>
 * 
 * @author Angeline
 * 
 */

 /*
 POUR MOI
 méthodes modifier la fiche technique ?
 */

public class FicheTechnique {
    
    //attributs
    private String processeur;
    private String carteGraphique;
    private int tailleEcran;

    //constructeur
    public FicheTechnique(String processeur, String carteGraphique, int tailleEcran){
        this.processeur=processeur;
        this.carteGraphique=carteGraphique;
        this.tailleEcran=tailleEcran;
    }    

    //getter et setter
    public String getProcesseur() {
        return processeur;
    }
    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }
    public int getTailleEcran() {
        return tailleEcran;
    }
    public void setTailleEcran(int tailleEcran) {
        this.tailleEcran = tailleEcran;
    }
    public String getCarteGraphique() {
        return carteGraphique;
    }
    public void setCarteGraphique(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }


}
