package greentower.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Button extends JButton {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Button(String string){
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























