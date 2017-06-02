package greentower.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Console extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextArea outputTextArea;
	public JTextField inputTextArea;
	public JScrollPane scrollPane;
	public JPanel JPan;
	public String current_input;
	public boolean isPressed;

	public Console(){
		super();
		this.isPressed = false;
		this.current_input = "";
		
		this.outputTextArea = new JTextArea();
		this.outputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.outputTextArea.setEditable(false);
		
		this.inputTextArea = new JTextField();
		this.inputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.inputTextArea.addActionListener(this);
	
		this.scrollPane = new JScrollPane(outputTextArea);
		this.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// Scroolbar should be unified with main theme 
		//this.scrollPane.setVerticalScrollBar(new JScrollBar());
		//this.scrollPane.setAutoscrolls(true);
		
		this.JPan = new JPanel();
		this.JPan.setLayout(new BorderLayout());
		this.JPan.add(this.scrollPane, BorderLayout.CENTER);
		this.JPan.add(this.inputTextArea, BorderLayout.SOUTH);
		
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
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
