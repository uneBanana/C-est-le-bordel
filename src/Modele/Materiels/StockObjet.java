package Modele.Materiels;
import java.util.*;

/**
 * <b><big> Classe StockObjet </b></big>
 * 
 * <p> 
 * Cette classe représente une liste qui contient tous les objets d'un même type de matériel.
 * <br>
 * Cette liste peut être modifiée par l'ajout ou la suppression d'un objet.
 * Il est également possible de modifier un objet.
 * </p>
 * 
 * <p>
 * Cette classe est utilisée pour définir la liste des objets de chaque type de matériel. 
 * L'ensemble de ces listes est stocké dans le stock général (de type Stock).
 * </p>
 * 
 * @author Angeline
 * 
 * @see Materiel
 * @see Stock
 * 
 */


/*
POUR  MOI
ajouter, supprimer, modifier objet
*/

public class StockObjet {
    
    //attribut
    private List<Materiel> listeObjets;

    //constructeur
    public StockObjet(){
        listeObjets = new ArrayList<>(); 
    }

    //getter et setter
    public List<Materiel> getListeObjets() {
        return listeObjets;
    }

    public void setListeObjets(List<Materiel> listeObjets) {
        this.listeObjets = listeObjets;
    }

    //méthodes

    /**
     * Ajoute un objet dans une liste de matériels StockObjet
     * 
     * @param objet
     */
    public void ajouterObjet(Materiel objet){
        listeObjets.add(objet);
    }

    /**
     * Supprime une objet d'une liste de matériels StockObjet
     * 
     * @param objet
     */
    public void supprimerObjet(Materiel objet){
        listeObjets.remove(objet);
    }

}
