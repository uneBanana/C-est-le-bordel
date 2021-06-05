package Vue;

import java.awt.event.*;
import javax.swing.*;

/**
 * <b>Menu est la classe qui crée et gère le menu en haut de la fenetre</b>
 * <p>
 * Il faut lui fournir la fenetre qui gère les changement du paneau centrale
 * </p>
 * 
 * @author Loukas
 * @version 1.0
 * 
 * @see Fenetre
 */

public class Menu extends JMenuBar implements ActionListener{

	//Attributs
	private Fenetre fenetre;

	private JMenu m_materiel, m_utilisateur, m_emprunt, accueil;
	private JMenuItem accueil2;
	private JMenuItem aj_m, ed_m, suppr_m;	//relatif au matériel
	private JMenuItem aj_u, ed_u, suppr_u;	//aux utilisateurs
	private JMenuItem aj_e, ed_e, suppr_e;	//aux emprunts
	
	//Constructeur
	public Menu(Fenetre f) {
		super();
		fenetre = f;
		
		m_materiel = new JMenu("Gestion de matériel");
		m_utilisateur = new JMenu("Gestion des utilisateurs");
		m_emprunt = new JMenu("Emprunt");
		accueil = new JMenu();
		accueil.setIcon (new ImageIcon ("img/home.png"));
		
		
		fenetre.setJMenuBar(this);
	
		//Partie matériel
		this.add(m_materiel);
		
		aj_m = new JMenuItem("Ajouter du matériel");
		aj_m.addActionListener(this);
		m_materiel.add(aj_m);
		ed_m = new JMenuItem("Modification du matériel");
		ed_m.addActionListener(this);
		m_materiel.add(ed_m);
		suppr_m = new JMenuItem("Suppression du matériel");
		suppr_m.addActionListener(this);
		m_materiel.add(suppr_m);
		
		//Partie utilisateur
		this.add(m_utilisateur);
		
		aj_u = new JMenuItem("Ajouter un utilisateur");
		aj_u.addActionListener(this);
		m_utilisateur.add(aj_u);
		ed_u = new JMenuItem("Modifier un utilisateur");
		ed_u.addActionListener(this);
		m_utilisateur.add(ed_u);
		suppr_u = new JMenuItem("Suppression d'un utilisateur");
		suppr_u.addActionListener(this);
		m_utilisateur.add(suppr_u);
		
		
		
		//Partie emprunt
		this.add(m_emprunt);
		
		aj_e = new JMenuItem("Emprunter");
		aj_e.addActionListener(this);
		m_emprunt.add(aj_e);
		ed_e = new JMenuItem("Modifier un emprunt");
		ed_e.addActionListener(this);
		m_emprunt.add(ed_e);
		suppr_e = new JMenuItem("Retour (fin d'emprunt)");
		suppr_e.addActionListener(this);
		m_emprunt.add(suppr_e);
		
		//accueil
		this.add(accueil);
		accueil2 = new JMenuItem("Retour à l'accueil");
		accueil2.addActionListener(this);
		accueil.add(accueil2);
	}
	
	/**
	 * Fonction qui gère les évenements (appuie sur un menu)
	 * En fonction de quel bouton est appuyé, on change le panel principal avec le bon JPanel
	 * 
	 * @param e l'évenement qui s'est produit
	 */
	public void actionPerformed(ActionEvent e) {
		//accueil
		if(e.getSource()==accueil2) {
			System.out.println("back to home");
			fenetre.changePanel(fenetre.getAccueil());
		}
		
		//Pour les emprunts
		if(e.getSource()==aj_e) {
			System.out.println("emprunt add");
			fenetre.changePanel(fenetre.getAjouterEmprunt());
		}
		else if (e.getSource()==ed_e) {
			System.out.println("editer emprunt");
			fenetre.changePanel(fenetre.getModifierEmprunt());
		}
		else if (e.getSource()==suppr_e) {
			System.out.println(" supprimer emprunt");
			fenetre.changePanel(fenetre.getSupprimerEmprunt());
		}
		
		//Pour le materiel
		if(e.getSource()==aj_m) {
			System.out.println("materiel add");
			fenetre.changePanel(fenetre.getAjouterMateriel());
		}
		else if (e.getSource()==ed_m) {
			System.out.println("editer materiel");
			fenetre.changePanel(fenetre.getModifierMateriel());
		}
		else if (e.getSource()==suppr_m) {
			System.out.println(" supprimer materiel");
			fenetre.changePanel(fenetre.getSupprimerMateriel());
		}
	}
}