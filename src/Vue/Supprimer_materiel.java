package Vue;

import java.awt.event.*;
import javax.swing.*;

/**
 * <b>Ajouter_materiel est la classe qui permet au gérant d'ajouter de nouveau objet au stock</b>
 * <p>
 * Il faut lui fournir la fenetre (@see Fenetre) qui gère les changement du paneau centrale
 * </p>
 * 
 * @author Loukas
 * @version 1.0
 */

public class Supprimer_materiel extends JPanel implements ActionListener{

	//Attributs
	Fenetre fenetre;
	
	/**
	 * Constructeur
	 * @param f la @see Fenetre dans laquelle il s'insère
	 */
	public Supprimer_materiel(Fenetre f) {
		super();
		fenetre = f;
		
		JLabel text = new JLabel("Supprimer du matériel");
		this.add(text);
	}
	
	/**
	 * Gestion des événements (appuie sur boutons...)
	 */
	public void actionPerformed(ActionEvent e) {
		
	}
}
