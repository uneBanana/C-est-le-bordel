package Modele.Materiels;

/**
 * <b><big> Classe Ordinateur </b></big>
 * 
 * <p> Cette classe représente le type de materiel Ordinateur. </p>
 * 
 * @author Angeline
 * 
 * @see Materiel
 * @see FicheTechnique
 * @see Date
 * 
 */
public class Ordinateur extends Materiel{
    
    //attributs
    private String modele;
    private FicheTechnique ficheTechnique;
    private Date achat;
    private Date renouvellement;

    //constructeur 
    public Ordinateur(int identifiant, Statut statut, String type, String modele, FicheTechnique ficheTechnique,
            Date achat, Date renouvellement) {
        super(statut, type);
        this.modele = modele;
        this.ficheTechnique = ficheTechnique;
        this.achat = achat;
        this.renouvellement = renouvellement;
    }

    //getter et setter
    public Date getRenouvellement() {
        return renouvellement;
    }
    public void setRenouvellement(Date renouvellement) {
        this.renouvellement = renouvellement;
    }
    public Date getAchat() {
        return achat;
    }
    public void setAchat(Date achat) {
        this.achat = achat;
    }
    public FicheTechnique getFicheTechnique() {
        return ficheTechnique;
    }
    public void setFicheTechnique(FicheTechnique ficheTechnique) {
        this.ficheTechnique = ficheTechnique;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    //methodes

    /*
    C'est l'attribut qui sera affiché dans la liste déroulante
    permettant à l'utilisateur de sélectionner un objet.
    */
    @Override
    public String toString(){
        return modele;
    }

}
