package greentower.ihm;
import java.awt.Dimension;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.io.File;import java.io.IOException;import javax.imageio.ImageIO;import javax.swing.ImageIcon;import javax.swing.JButton;import javax.swing.JFrame;import javax.swing.JTextField;import greentower.core.sound.SoundBox;
/** *  * @author Rayan * */
public class MainWindow extends JFrame implements ActionListener{
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;	/**	 * The new game button	 */
	private JButton bt1;		/**	 * The leave button	 */
	private JButton bt2;	/**	 * The console	 */
	private Console console; 		/**	 * 	 */	private JTextField name;		/**	 * 	 */	protected SoundBox soundBox;
	/**	 * Set params of JFrame	 */
	public MainWindow(){
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		try {			this.setIconImage(ImageIO.read(this.getClass().getResourceAsStream("/images/graine.png")));		} catch (IOException e1) {			// TODO Auto-generated catch block			e1.printStackTrace();		}
		this.setVisible(true);
		//Jpanel
		try {			this.setContentPane(new GTG(ImageIO.read(this.getClass().getResourceAsStream("/images/mojo.jpg"))));		} catch (IOException e) {			// TODO Auto-generated catch block			e.printStackTrace();		}
		this.setVisible(true);
		//Bouton		this.bt1 = new Button("New Game");		this.bt2 = new Button("Leave");		this.name = new JTextField("Nom :");		this.name.setPreferredSize(new Dimension(150, 20));
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);		this.getContentPane().add(this.name);
		this.getContentPane().add(this.bt1);
		this.getContentPane().add(this.bt2);
		this.setVisible(true);
		//Sound		this.soundBox = new SoundBox();		soundBox.playSoundLoop(SoundBox.SOUND_SKYRIM);		System.out.println("pass");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == bt1)
		{			if(this.name.getText().length() != 0)			{				this.soundBox.playSoundOnce(SoundBox.SOUND_PLAY);
				this.dispose();
				this.console = new Console(this);
				this.console.setVisible(true);				this.console.getInputText().requestFocus();			}
		}		
		if(arg0.getSource() == bt2)
		{
			this.dispose();
			new ExitWindow(this);	    
		}
	}	public String getName(){		return this.name.getText();	}		/**	 * Getter for the console	 * @return the console	 */	public Console getConsole(){		return this.console;	}		public SoundBox getSoundBox(){		return this.soundBox;	}
}