package Modele.Materiels;
import java.util.*;

/**
 * <b><big> Classe Stock </b></big>
 * 
 * <p> Cette classe représente le stock complet du matériel de l'entreprise.
 * Il est constitué d'une liste de couples(HashMap), chaque couple correspondant à un type d'objet.
 * Ces couples sont composés d'une clé et d'une valeur.
 * La clé est le nom du type d'objet. La valeur est une liste complète des objets de ce type que l'entreprise possède.
 * </p>
 * 
 * @author Angeline
 * 
 * @see StockObjet
 * 
 */

 /*
    POUR MOI    
    liste des objets que l'entreprise possède
    une liste pour chaque type d'objet ?
    fonction equals --> attention à la clé 
    petit plus : rassembler les objets qui ont exactement les mêmes attributs (mis à part l'identifiant) --> savoir combien il y en a 

    liste de couples (nom_objet, liste des objets de ce type)
    --> liste de hashmap (clé + valeur) 
    clé = string (type d'objet)
    valeur = liste de matériel

    faire serialisation
 */


public class Stock {

    private List<HashMap<String, StockObjet>> stock;
    private String[] listeTypes = {"Ordinateur", "Moto", "Voiture", "Accessoire Informatique", "Accessoire Véhicule"}; //liste des types d'objet

    /*
    constructeur
    Initialise le stock avec autant de hashmap que de types de matériel.
    */
    public Stock(){      

        int i;
        int nbTypes = listeTypes.length;
        StockObjet stockObjet;
        HashMap<String,StockObjet> temp;
        stock = new ArrayList<HashMap<String, StockObjet>>();

        for(i=0; i<nbTypes; i++){
            stockObjet  = new StockObjet();
            temp = new HashMap<String,StockObjet>();
            temp.put(listeTypes[i], stockObjet);
            stock.add(temp);
        }
    }

    //getter et setter
    public List<HashMap<String, StockObjet>> getStock() {
        return stock;
    }
    public void setStock(List<HashMap<String, StockObjet>> stock) {
        this.stock = stock;
    } 
    public String[] getListeTypes() {
        return listeTypes;
    }
    public void setListeTypes(String[] listeTypes) {
        this.listeTypes = listeTypes;
    }

    //méthodes

    /**
     * 
     * @param type
     *      String donnant le type de l'objet
     * @param objet
     *      Objet (Materiel) à ajouter
     */
    public void ajouter(String type, Materiel objet){
        int i;
        int taille = stock.size();

        for(i=0; i<taille;  i++){
            if(stock.get(i).containsKey(type)){
                stock.get(i).get(type).ajouterObjet(objet);
            }
        }
    }

    /**
     * 
     * @param type
     *      String donnant le type de dont on souhaite la liste des objets
     * @return liste des objets du type souhaité
     * 
     */
    public StockObjet getStockObjet(String type){
        int i;
        int taille = stock.size();
        StockObjet temp =  new StockObjet();

        for(i=0; i<taille;  i++){
            if(stock.get(i).containsKey(type)){
                temp = stock.get(i).get(type);
            }
        }

        return temp;
    }

}
