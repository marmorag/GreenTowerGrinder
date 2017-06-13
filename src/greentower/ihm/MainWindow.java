package greentower.ihm;
import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.io.File;import java.io.IOException;import javax.sound.sampled.AudioInputStream;import javax.sound.sampled.AudioSystem;import javax.sound.sampled.Clip;import javax.sound.sampled.LineUnavailableException;import javax.sound.sampled.UnsupportedAudioFileException;import javax.swing.ImageIcon;import javax.swing.JButton;import javax.swing.JFrame;import greentower.core.sound.SoundBox;
/** *  * @author Rayan * */
public class MainWindow extends JFrame implements ActionListener{
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;	/**	 * The new game button	 */
	private JButton bt1;		/**	 * The leave button	 */
	private JButton bt2;	/**	 * The console	 */
	private Console console; 		/**	 * 	 */	protected SoundBox soundBox;
	/**	 * Set params of JFrame	 */
	public MainWindow(){
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
		//Bouton		bt1 = new Button("New Game");		bt2 = new Button("Leave");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		this.getContentPane().add(bt1);
		this.getContentPane().add(bt2);
		this.setVisible(true);
		//Sound		this.soundBox = new SoundBox();		soundBox.playSoundLoop(SoundBox.SOUND_SKYRIM);		System.out.println("pass");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == bt1)
		{			this.soundBox.playSoundOnce(SoundBox.SOUND_PLAY);
			this.dispose();
			this.console = new Console(this);
			this.console.setVisible(true);
		}		
		if(arg0.getSource() == bt2)
		{
			this.dispose();
			new ExitWindow(this);	    
		}
	}	/**	 * Getter for the console	 * @return the console	 */	public Console getConsole(){		return this.console;	}
}