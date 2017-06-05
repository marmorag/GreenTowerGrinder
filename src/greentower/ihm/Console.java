package greentower.ihm;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Console extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextArea outputTextArea;
	public JTextField inputTextArea;
	private JScrollPane scrollPane;
	private JPanel JPan;
	public JLabel prompt;
	public String current_input;
	public boolean isPressed;
	private Image image;

	public Console(){
		super();
		
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setUndecorated(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		try
		{
			this.setIconImage(ImageIO.read(new File("images/graine.png")));
		} catch (IOException e2)
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try
		{
			this.setFont(Font.createFont(Font.TRUETYPE_FONT, new File("images/SweetLeaf.ttf")));
		} catch (FontFormatException | IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		this.isPressed = false;
		this.current_input = "";
		
		try {
			this.image = ImageIO.read(new File("images/bc.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.prompt = new JLabel();
		this.prompt.setText("\\> ");
		
		this.outputTextArea = new JTextArea();
		//this.outputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.outputTextArea.setEditable(false);
		
		//auto-scroll
		DefaultCaret caret = (DefaultCaret)outputTextArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		this.inputTextArea = new JTextField();
		//this.inputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.inputTextArea.addActionListener(this);
	
		this.scrollPane = new JScrollPane(outputTextArea);
		this.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// Scroolbar should be unified with main theme 
		//this.scrollPane.setVerticalScrollBar(new JScrollBar());
		//this.scrollPane.setAutoscrolls(true);
		
		this.JPan = new GTG(this.image);
		this.JPan.setLayout(null);
		this.JPan.add(this.scrollPane);
		this.JPan.add(this.prompt);
		this.JPan.add(this.inputTextArea);
		
		this.scrollPane.setBounds(25,25,850,515);
		this.inputTextArea.setBounds(20,555,850,20);
		this.prompt.setBounds(0,555,50,20);
		
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
	
	public void resetAction(){
		this.isPressed = false;
	}
	
	public void updateFocus()
	{
		//this.scrollPane.set//setVerticalScrollBar().setValue(outputTextArea.getRows());
	}

}
