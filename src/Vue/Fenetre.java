package Vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.*;

import Modele.Materiels.Stock;


/**
 * <b><big> Classe Fenetre </b></big>
 * <p>
 * Classe qui va afficher la fenetre principale. Elle hérite alors naturellement de JFrame.
 * Elle contient un menu et un paneau JPanel principal que l'on va chaner en fonction de quelle page on veut afficher.
 * </p>
 * 
 * @see Menu
 * @see Accueil
 * @see Nouvel_emprunt
 * 
 * @author Loukas
 * @version 1.0
 *
 */

public class Fenetre extends JFrame implements ActionListener{
	
	//#####Attributs######
	
	//Général
	private String title = "CestLeBordel Application";
	private int size_x = 900;
	private int size_y = 750;
	private JPanel principal;
	
	//des autres classes
	private Stock stock;
	
	//menu
	private JMenuBar menuBar;
	
	//Accueil
	private JPanel accueil;
	
	//Emprunt
	private JPanel emprunt_ajouter;	//Affichage nouvel emprunt
	private JPanel emprunt_editer;	//Affichage editer un emprunt
	private JPanel emprunt_supprimer; 	//Affichage retour

	//Materiel
	private JPanel materiel_ajouter;	//Affichage nouveau matériel
	private JPanel materiel_editer;	//Affichage editer matériel
	private JPanel materiel_supprimer;	//Affichage nouveau matériel
	
	//Gestion des utilisateurs
	//
	
	
	public Fenetre() {
		//Base fenetre
		this.setSize(size_x, size_y);
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Stock
		stock = new Stock();
		
		//Menu
		menuBar = new Menu(this);
		
		//Accueil
		accueil = new Accueil();
		this.changePanel(accueil);
		
		
		//Emprunt
		emprunt_ajouter = new Nouvel_emprunt(this);
		emprunt_editer = new ModifierEmprunt(this);
		emprunt_supprimer = new Retour_emprunt(this);
		
		//Materiel
		materiel_ajouter = new Ajouter_materiel(this);
		materiel_editer = new Modifier_materiel(this);
		materiel_supprimer = new Supprimer_materiel(this);
		
		
		
		//####################
		//Gestion Matériel
		
		
		
	}
	
	/**
	 * Fonction qui va changer le paeau principal lorsque l'on change de fenetre (en appuyant suun menu ou enretournant àl'accueil par exemple)
	 * @param p le JPanel àmettre en panel principal
	 */
	void changePanel(JPanel p) {
		this.setContentPane(p);
		this.repaint();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Fenetre f = new Fenetre();
	}


	//Getters utiles pour récuperer les JPanel et les changer depuis Menu.java et d'autres
	public Stock getStock() {
		return stock;
	}

	public JPanel getAccueil() {
		return accueil;
	}
	
	//Getters des emprunts
	public JPanel getAjouterEmprunt() {
		return emprunt_ajouter;
	}

	public JPanel getModifierEmprunt() {
		return emprunt_editer;
	}
	
	public JPanel getSupprimerEmprunt() {
		return emprunt_supprimer;
	}
	
	//Getters relatifs au matériel
	public JPanel getAjouterMateriel() {
		return materiel_ajouter;
	}

	public JPanel getModifierMateriel() {
		return materiel_editer;
	}
	
	public JPanel getSupprimerMateriel() {
		return materiel_supprimer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
