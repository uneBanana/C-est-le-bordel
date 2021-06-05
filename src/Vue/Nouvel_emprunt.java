package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modele.Materiels.Materiel;
import Modele.Materiels.StockObjet;

public class Nouvel_emprunt extends JPanel implements ActionListener{
	
	//Attributs
	private Fenetre fenetre;
	private JPanel bas;
	private JComboBox liste1, liste2;
	private JButton annuler, suivant, typeOk;
	
	public Nouvel_emprunt(Fenetre f) {
		// TODO Auto-generated constructor stub
		super();
		this.fenetre = f;
		
		this.setLayout(new BorderLayout());
		JPanel gauche = new JPanel();
		JPanel droite = new JPanel(new BorderLayout());
		JPanel haut = new JPanel();
		bas = new JPanel();
		JPanel selection = new JPanel(new GridLayout(2,1,5,5));
		selection.setBackground(Color.orange);
		JPanel boutons = new JPanel();
		JPanel info = new JPanel();
		info.setBackground(Color.cyan);
		JLabel text = new JLabel("Ajouter un matériel");
		String[] type = fenetre.getStock().getListeTypes();
		liste1 = new JComboBox(type);
		
		String[] vide = {"Matériel"};	//Vide tant que pas choisis, Apres il faudra mettre la liste des materiels en fonction du choix du type
		liste2 = new JComboBox(vide);
		
		annuler = new JButton("Annuler");
		annuler.addActionListener(this);
		suivant = new JButton("Suivant");
		suivant.addActionListener(this);
		typeOk = new JButton("->");
		typeOk.addActionListener(this);
		
		selection.add(haut);
		haut.add(text);
		selection.add(bas);
		bas.add(liste1);
		bas.add(typeOk);
		bas.add(liste2);
		boutons.add(annuler);
		boutons.add(suivant);
		
		gauche.add(selection);
		info.setPreferredSize(new Dimension(fenetre.getWidth()/20,fenetre.getHeight()/20));
		droite.add(info, BorderLayout.CENTER);
		
		this.add(gauche, BorderLayout.WEST);
		this.add(boutons, BorderLayout.SOUTH);
		this.add(droite);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==annuler) {
			System.out.println("annuler_emprunt");
			fenetre.changePanel(fenetre.getAccueil());
		}
		if(e.getSource()==typeOk){
			//On va récupérer la liste des matériels en fonction du type choisis
			StockObjet s = fenetre.getStock().getStockObjet(liste1.getSelectedItem().toString());
			List<Materiel> listeMat = s.getListeObjets();
			String[] liste = new String[listeMat.size()];
			//Maintenant on prend le toString() de chaque objet
			int i;
			for(i=0; i<listeMat.size(); i++) {
				liste[i] = "a";
						//(listeMat.get(i)).toString());
			}
			bas.remove(liste2);
			liste2 = new JComboBox(liste);
			bas.add(liste2);
			System.out.println("changement mat");
			
		}
	}	
}
