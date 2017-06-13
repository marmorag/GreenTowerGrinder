package greentower.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

/**
 * This class represent a custom button
 * @author Guillaume
 *
 */
public class Button extends JButton {

	
	/**
	 * Serial Version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor of Button
	 * @param string
	 */
	public Button(String string){
		super();
		this.setText(string);
		initialize();
	}
	
	/**
	 * Set attributes' values 
	 */
	public void initialize(){
		this.setForeground(Color.WHITE);
		this.setBackground(Color.GRAY);
		this.setSize(new Dimension(160, 40)); 
	}
}























