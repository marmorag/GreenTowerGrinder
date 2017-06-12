package greentower.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MainWindow extends JFrame implements ActionListener{


	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	/**	 * The new game button	 */
	private JButton bt1;	/**	 * The leave button	 */
<<<<<<< refs/remotes/origin/develop
	private JButton bt2 = new Button("Leave");	/**	 * The console	 */
=======
	private JButton bt2;	/**	 * The console	 */
>>>>>>> [LOGIC] Moved all attributes's initialization into constructors
	private Console console; 
	protected Clip clip;
	
	public MainWindow(){

		//def frame
		
		//propri�t� JFrame
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("images/graine.png").getImage());
		this.setVisible(true);
		
		//Jpanel
		this.setContentPane(new GTG(new ImageIcon("images/mojo.jpg").getImage()));
		this.setVisible(true);
		
<<<<<<< refs/remotes/origin/develop
		//Bouton		bt1 = new Button("New Game");		bt2 = new Button("Leave");
=======
		//Bouton		this.bt1 = new Button("New game");		this.bt2 = new Button("Leave");
>>>>>>> [LOGIC] Moved all attributes's initialization into constructors
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		this.getContentPane().add(bt1);
		this.getContentPane().add(bt2);
		this.setVisible(true);
		
		//Sound
		
		try 
		{
			clip = AudioSystem.getClip();
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound/Skyrim_OST.wav"));
			clip.open(ais);
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
		} 
		catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) 
		{
			//e.printStackTrace();
			System.err.print("SoundException");
		}
		
	}
		

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == bt1)
		{
			this.dispose();
			this.console = new Console(this);
			this.console.setVisible(true);
		}		
		 if(arg0.getSource() == bt2)
		 {
			 this.dispose();
			 new ExitWindow(this);
			 //System.exit(0);		    
		 }
	}
		/**	 * Stop the game sound	 */
	public void stopSong()
	{
		this.clip.stop();
	}	/**	 * Getter for the console	 * @return	 */	public Console getConsole(){		return this.console;	}

}