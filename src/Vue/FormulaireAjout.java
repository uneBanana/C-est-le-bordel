package Vue;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;

/**
 * Classe qui hérite de JPanel.
 * Panneau qui va en fonction de la liste des attributs a demander va afficher un formulaire pour demander à l'utilisateur de remplir les différents champs
 * 
 * @author Loukas
 * @version 1.0
 * 
 * @see Ajouter_materiel
 *
 */

public class FormulaireAjout extends JPanel implements ActionListener{
	
	//Attributs
	int nb;
	String[][] attributs;
	JButton annuler,ok;
	JLabel[] labels;
	Container[] reponses;

	
	/**
	 * Constructeur
	 * @param attributs, une liste de chaine de caracteres, les attributs a demander à l'utilisateur
	 */
	public FormulaireAjout(String[][] _attributs) {
		//Appele du consrtucteur de JPanel
		super();
		
		nb = _attributs.length;
		attributs = _attributs;
		
		this.setLayout(new GridLayout(nb+1,2,10,10));
		
		int i;
		String type;
		Container res;
		labels = new JLabel[nb];
		reponses = new Container[nb];
		for (i=0; i<nb; i++) {
			labels[i] = new JLabel(attributs[i][1]);
			type = attributs[i][0];
			
			if(type.equals("String")) {
				JTextArea t = new JTextArea();
				Container c = (Container)t;
				res = c;
			}
			else {
				JButton b = new JButton("aaaaaaa");
				res = (Container) b;
			}
			
			this.add(labels[i]);
			this.add(reponses[i]);
		}
		
		annuler = new JButton("Annuler");
		ok = new JButton("OK");
		this.add(annuler);
		this.add(ok);
		
	}
	
//	Container typeDemande(String type) {
//		if(type.equals("String")) {
//			JTextArea t = new JTextArea();
//			Container c = (Container)t;
//			return c;
//		}
//	}


	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
