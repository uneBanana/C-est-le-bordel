package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Modele.Materiels.Materiel;
import Modele.Materiels.Stock;
import Modele.Materiels.StockObjet;

/**
 * <b>Ajouter_materiel est la classe qui permet au gérant d'ajouter de nouveau objet au stock</b>
 * <p>
 * Il faut lui fournir la fenetre (@see Fenetre) qui gère les changement du paneau centrale
 * </p>
 * 
 * @author Loukas
 * @version 1.0
 */

public class Ajouter_materiel extends JPanel implements ActionListener{

	//Attributs
	private Fenetre fenetre;			//La fenetre dans laquel on affichera les choses et récuperera les stocks
	private JComboBox liste1;			//La liste de materiel
	private JButton annuler, suivant;	//Les boutons
	private JPanel demande;
	
	public Ajouter_materiel(Fenetre f) {
		// TODO Auto-generated constructor stub
		super();
		this.fenetre = f;
		
		this.setLayout(new BorderLayout());
		JPanel gauche = new JPanel();
		JPanel droite = new JPanel();
		droite.setBackground(Color.black);
		JPanel haut = new JPanel();
		JPanel bas = new JPanel();
		JPanel selection = new JPanel(new GridLayout(2,1,5,5));
		selection.setBackground(Color.orange);
		JPanel boutons = new JPanel();
		JPanel demande = new JPanel();
		demande.setBackground(Color.cyan);
		JLabel text = new JLabel("Ajouter un matériel");
		String[] type = f.getStock().getListeTypes();
//		String[] type = {"a","b","c"};
		liste1 = new JComboBox(type);
		
		
		annuler = new JButton("Annuler");
		annuler.addActionListener(this);
		suivant = new JButton("Suivant");
		suivant.addActionListener(this);
		
		selection.add(haut);
		haut.add(text);
		selection.add(bas);
		bas.add(liste1);

		boutons.add(annuler);
		boutons.add(suivant);
		
		gauche.add(selection);
		demande.setPreferredSize(new Dimension(fenetre.getWidth()/20,fenetre.getHeight()/20));
		
		droite.add(demande);
		
		this.add(gauche, BorderLayout.WEST);
		this.add(boutons, BorderLayout.SOUTH);
		this.add(droite);
	}
	
	private void changeDemandePanel(JPanel p) {
		demande = p;
	}

	/**
	 * <p>
	 * On va vérifier si l'on a appuyer sur un bouton :
	 * <ul>
	 * <li>Si l'on appuie sur annuler, on revient à l'accueil </li>
	 * <li>Si l'on appuie sur suivant, en fonction du matériel séléctionné, on va afficher un paneau qui demande les information complémentaires.</li>
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==annuler) {
			System.out.println("annuler_emprunt");
			fenetre.changePanel(fenetre.getAccueil());
		}
		if(e.getSource()==suivant) {
			String type = liste1.getSelectedItem().toString();
			System.out.println("Vous voulez :  " + type);
			String[][] testListe = {{"int","prix"},{"int","année de fabrication"},{"String","marque"},{"String","couleur"}};
			
			JPanel demandeBis = new FormulaireAjout(testListe);
			changeDemandePanel(demandeBis);
//			fenetre.changePanel(this);
			JFrame test = new JFrame();
			test.add(demandeBis);
			test.setSize(200, 200);
			test.setTitle("Titre test");
			test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			test.setVisible(true);
			
		}
	}
}