package greentower.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;

/** * This JFrame contains the text and the input * @author Guillaume * */public class Console extends JFrame implements ActionListener, KeyListener{
	/**
	 * Serial Version id
	 */
	private static final long serialVersionUID = 1L;
		/**	 * The outpout screen	 */
	private JTextArea outputTextArea;	/**	 * The input console	 */
	private JTextField inputTextArea;	/**	 * The scrool bar	 */
	private  JScrollPane scrollPane;	/**	 * The main panel	 */
	private  JPanel JPan;	/**	 * Prompt : ">"	 */
	private JLabel prompt;	/**	 * User current input	 */
	private String current_input;	/**	 * Test if key is pressed	 */
	private boolean isPressed;	/**	 * Font image	 */
	private  Image image;	/**	 * The MainWindow	 */
	private  MainWindow mainWindow;
	/**	 * Set parameters to the JFrame	 * @param main	 */
	public Console(MainWindow main){
		super();		
		this.mainWindow = main;
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 620);
		this.setUndecorated(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.addKeyListener(this);		
		try
		{
			this.setIconImage(ImageIO.read(new File("images/graine.png")));
		} catch (IOException e2)
		{
			e2.printStackTrace();
		}
		try
		{
			this.setFont(Font.createFont(Font.TRUETYPE_FONT, new File("images/SweetLeaf.ttf")));
		}catch (FontFormatException | IOException e1)
		{
			e1.printStackTrace();
		}
		try {
			this.image = ImageIO.read(new File("images/bc.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}				this.current_input = "";		this.isPressed = false;
		this.prompt = new JLabel();
		this.prompt.setText("\\> ");
		this.prompt.setForeground(Color.WHITE);
		//TODO (done) Look at comments and delete them if necessary
		this.outputTextArea = new JTextArea();
		this.outputTextArea.setEditable(false);
		//auto-scroll
		DefaultCaret caret = (DefaultCaret)outputTextArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		this.inputTextArea = new JTextField();
		this.inputTextArea.addActionListener(this);
		this.scrollPane = new JScrollPane(outputTextArea);
		this.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.JPan = new GTG(this.image);
		this.JPan.setLayout(null);
		this.JPan.add(this.scrollPane);
		this.JPan.add(this.prompt);
		this.JPan.add(this.inputTextArea);
		this.scrollPane.setBounds(25,25,850,515);
		this.inputTextArea.setBounds(25,555,850,20);
		this.prompt.setBounds(5,555,50,20);
		this.setContentPane(JPan);
		this.setVisible(false);
	}
	/**
	 * Setters for the text area used for the display
	 * @param str
	 */
	public void setOutput(String str)
	{
		this.outputTextArea.append(str);
	}
	/**
	 * Setters for the text area used for the input
	 * @param str
	 */
	public void setInput(String str)
	{
		this.inputTextArea.setText(str);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		this.current_input = this.inputTextArea.getText();
		this.inputTextArea.setText("");
		this.isPressed = true;
	}
	/**
	 * Getter for the input area
	 * @return the current String contained in the input area
	 */
	public String getInput(){
		return this.current_input;
	}
	/**
	 * Getter for the output area
	 * @return the current String contained in the output area
	 */
	public String getOutput()
	{
		return this.outputTextArea.getText();
	}
	/**	 * Set isPressed to false to allow player to answer again	 */
	public void resetAction(){
		this.isPressed = false;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("event key typed");
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_END) {
			this.mainWindow.clip.stop();
		}
		if (key == KeyEvent.VK_ESCAPE)
		{
			new ExitWindow(this);
			this.dispose();
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}		/**	 * Return if the key has been pressed	 * @return state of the key	 */	public boolean getIsPressed(){		return this.isPressed;	}
}
