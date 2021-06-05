package Vue;

import java.awt.Color;
import javax.swing.*;

public class Accueil extends JPanel{
	
	public Accueil() {
		// TODO Auto-generated constructor stub
		super();
		this.setBackground(Color.WHITE);
		
		ImageIcon img_accueil = new ImageIcon("img/welcome.gif");
		JLabel img = new JLabel();
		img.setIcon(img_accueil);
		this.add(img);
	}
}
