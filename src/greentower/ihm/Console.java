package greentower.ihm;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Console extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Console(){
		super();
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		JPanel test = new JPanel();
		this.setContentPane(test);
		JTextArea print = new JTextArea();
		JTextArea print2 = new JTextArea();
		print.setBorder(BorderFactory.createLineBorder(Color.black));
		print2.setBorder(BorderFactory.createLineBorder(Color.black));
		test.setLayout(new BorderLayout());
		test.add(print, BorderLayout.CENTER);
		test.add(print2, BorderLayout.SOUTH);
		
		this.setVisible(true);

	}


}
