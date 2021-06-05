package Modele.Materiels;

/**
 * <b><big> Classe Date </b></big>
 * 
 * <p> Cette classe représente le format de la date (utilisé pour donner la date d'emprunt par exemple)
 * Ici on adopte un format de date donnée uniquement avec des entiers.
 * </p>
 * 
 * @author Angeline
 * 
 * @see Ordinateur
 */

 /*
    POUR MOI
    petit plus : conversion qui renvoie (affiche) la date écrite (méthode toString)
 */

public class Date { 
    
    //attributs
    private int jour;
    private int mois;
    private int annee;

    //constructeur
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    //getter et setter
    public int getJour() {
        return jour;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public int getMois() {
        return mois;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }

}
