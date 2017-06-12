package greentower.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Bouton extends JButton {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bouton(String string){
		super();
		this.setText(string);
		initialize();
	}
	
	public void initialize(){
		
		this.setForeground(Color.WHITE);
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(160, 40)); 
	}
}























