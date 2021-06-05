package Vue;

import java.awt.event.*;
import javax.swing.*;

/**
 * <b>ModifierEmprunt est la classe qui permet de modifier les emprunts</b>
 * <p>
 * Il faut lui fournir la fenetre qui gère les changement du paneau centrale
 * </p>
 * @author Loukas
 * @version 1.0
 */

public class ModifierEmprunt extends JPanel implements ActionListener{

	//Attributs
	Fenetre fenetre;
	
	/**
	 * Constructeur
	 * @param f la @see Fenetre dans laquelle il s'insère
	 */
	public ModifierEmprunt(Fenetre f) {
		super();
		fenetre = f;
		
		
		
		JLabel text = new JLabel("Modifier des emprunts");
		this.add(text);
	}
	
	/**
	 * Gestion des événements (appuie sur boutons...)
	 */
	public void actionPerformed(ActionEvent e) {
		
	}
}
