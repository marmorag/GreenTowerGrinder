package greentower.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;




public class MainWindow extends JFrame implements ActionListener{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Console cons ;
	private JFrame frame ; 
	private JButton bt1 = new Bouton("Nouvelle Partie");
	private JButton bt2 = new Bouton("Quitter");
	
	public MainWindow(){

		//def frame
		
		frame = new JFrame();
		
		//propriété JFrame
		frame.setTitle("The Green Tower Grinder");
		frame.setSize(900, 600);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//Jpanel
		frame.setContentPane(new GTG(new ImageIcon("images/mojo.jpg").getImage()));
		frame.setVisible(true);
		
		//Bouton
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		frame.getContentPane().add(bt1);
		frame.getContentPane().add(bt2);
		frame.setVisible(true);
		}
		

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == bt1)
			
			
		//TODO
		
		  if(arg0.getSource() == bt2){
			  this.dispose();
		    
		}
		
	}

}