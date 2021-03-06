package greentower.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This window display the message Are you sure you want to quit? 
 * to the player with Yes and No button
 * @author guillaume
 *
 */
public class ExitWindow extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6629973015506180972L;

	/**
	 * The yes answer button
	 */
	private JButton yesButton;
	
	/**
	 * The no answer button
	 */
	private JButton noButton;
	
	/**
	 * Label to exit
	 */
	private JLabel exitLabel;
	
	/**
	 * Panel of the pop-up
	 */
	private JPanel panel;
	
	/**
	 * The MainWindow
	 */
	private JFrame mainWindow;
	
	/**
	 * Set params of JFrame
	 * @param main
	 */
	public ExitWindow(JFrame main) {
		this.setTitle("");
		this.setSize(250, 75);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		
		// panel
		this.panel = new JPanel();
		this.setContentPane(panel);
		
		// exitLabel
		this.exitLabel = new JLabel("Are you sure you want to leave ?");
		this.panel.add(exitLabel);
		
		// yesBtn
		this.yesButton = new JButton("Yes");
		this.yesButton.setSize(125, 40);
		this.yesButton.addActionListener(this);
		this.panel.add(yesButton);
		
		// noButton
		this.noButton = new JButton("No");
		this.noButton.setSize(125, 40);
		this.noButton.addActionListener(this);
		this.panel.add(noButton);
		
		this.mainWindow = main;
		
		this.setVisible(true);	
	}
	
	@Override
	/**
	 * Action performed on event
	 */
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == yesButton)
		{
			System.exit(0);	
		}		
		if(arg0.getSource() == noButton)
		{
			this.dispose();
			mainWindow.setVisible(true);
		}
		
	}
	
	
}
