package greentower.ihm;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class GTG extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 private Image img;
     
	    public GTG(Image img){
	        this.img = img;
	    }

	public GTG() {
		}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

