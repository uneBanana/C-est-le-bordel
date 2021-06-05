package Modele.Materiels;

/**
 * <b><big> Classe abstraite Materiel </b></big/>
 * 
 * <p> Cette classe définit les attributs communs à tout le matériel de l'entreprise, à savoir :
 * <ul>
 * <li>un identifiant</li>
 * <li>un statut</li>
 * <li>un type</li>
 * </ul>
 * </p>
 * 
 * @author Angeline
 * 
 * @see Statut
 * @see Vehicule
 * @see Moto
 * @see Voiture
 * @see Ordinateur
 * @see AccessoireInformatique
 * @see AccessoireVehicule
 * 
 */

public abstract class Materiel {

    //attributs
    private int identifiant = 0;
    private Statut statut;
    private String type;

    //constructeur
    public Materiel(Statut statut, String type){
        identifiant++;
        this.setStatut(statut);
        this.setType(type);
    }

    //getter et setter
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //méthodes

    /**
     * Surcharge de la méthode equals
     * Cela permet de comparer deux objets selon leur identifiant, et non leur référence.
     * 
     * @param obj 
     * Donne l'objet à comparer avec celui qui appelle la méthode.
     * 
     * @return Un booléen indiquant si les deux objets sont identiques ou non.
     */
    @Override
    public boolean equals(Object obj) {
        Materiel materiel = (Materiel) obj;
        if(this.identifiant == materiel.identifiant){
            return true;
        } else {
            return false;
        }
    }

    public void ajouter(String type, int nombreExemplaire){
        
    }


}
