package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <b>Retour_emprunt est la classe qui crée et gère le paneau de retour des emprunts</b>
 * <p>
 * Il faut lui fournir la fenetre (@see Fenetre) qui gère les changement du paneau centrale
 * </p>
 * 
 * @author Loukas
 * @version 1.0
 */

public class Retour_emprunt extends JPanel implements ActionListener{

	//Attributs
	private Fenetre fenetre;
	private JTextField nom, prenom;
	private JButton annuler, suivant;
	
	//Constructeur
	public Retour_emprunt(Fenetre f) {
		super();
		this.fenetre = f;
		
		this.setLayout(new BorderLayout());
		JPanel gauche = new JPanel();
		JPanel droite = new JPanel(new BorderLayout());
		JPanel titre = new JPanel();
		JPanel champs = new JPanel();
		JPanel selection = new JPanel(new GridLayout(2,1,5,5));
		selection.setBackground(Color.orange);
		JPanel boutons = new JPanel();
		JPanel info = new JPanel();
		info.setBackground(Color.cyan);
		JLabel text = new JLabel("Page des retours");
		
		nom = new JTextField();
		prenom = new JTextField();
		
		
		annuler = new JButton("Annuler");
		annuler.addActionListener(this);
		suivant = new JButton("Suivant");
		suivant.addActionListener(this);
		
		selection.add(titre);
		titre.add(text);
		
		selection.add(champs);
		champs.setLayout(new GridLayout(2,2,5,5));
		champs.add(new JLabel("Nom de l'utilisateur"));
		champs.add(nom);
		champs.add(new JLabel("Prénom de l'utilisateur"));
		champs.add(prenom);
		
		boutons.add(annuler);
		boutons.add(suivant);
		
		gauche.add(selection);
		droite.add(info, BorderLayout.CENTER);
		
		this.add(gauche, BorderLayout.WEST);
		this.add(boutons, BorderLayout.SOUTH);
		this.add(droite);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==annuler) {
			System.out.println("annuler retour");
			fenetre.changePanel(fenetre.getAccueil());
		}
	}
}
