package greentower.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Bouton extends JButton {

	
	/**
	 * This class represent a bouton
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor 
	 * @param string
	 */
	
	public Bouton(String string){
		super();
		this.setText(string);
		initialize();
	}
	
	/**
	 * Method that contain the boutons parameters 
	 */
	public void initialize(){
		
		this.setForeground(Color.WHITE);
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(160, 40)); 
	}
}























