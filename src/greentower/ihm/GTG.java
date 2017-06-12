package greentower.ihm;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class GTG extends JPanel{

	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		new MainWindow();
		}
	
	 private Image img;
     
	    public GTG(Image img){
	        this.img = img;
	    }

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

