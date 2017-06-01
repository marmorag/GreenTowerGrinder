package greentower.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


import greentower.IO.OutputConsole;
import greentower.core.Game;
import greentower.core.Player;


public class MainWindow extends JFrame implements ActionListener{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private JButton bt1 = new Bouton("Nouvelle Partie");
	private JButton bt2 = new Bouton("Quitter");
	
	public MainWindow(){

		//propriété JFrame
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		//Jpanel
		this.setContentPane(new GTG(new ImageIcon("images/mojo.jpg").getImage()));
		this.setVisible(true);
		
		//Bouton
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		this.getContentPane().add(bt1);
		this.getContentPane().add(bt2);
		this.setVisible(true);
		}
		

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == bt1)
			this.dispose();
			Console console = new Console();
		//TODO
		
		  if(arg0.getSource() == bt2){
			  this.dispose();
		    
		}
		
	}

}