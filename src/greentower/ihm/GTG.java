package greentower.ihm;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * Custom JPanel with image
 * @author Rayan 
 *
 */
public class GTG extends JPanel{

	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * An readable image
	 */
	private Image img;

	/**
	 * @param img
	 */
	public GTG(Image img){
		this.img = img;
	}

	/**
	 * Empty constructor
	 */
	public GTG() {

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

