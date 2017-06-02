package greentower.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Console extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextArea outputTextArea = new JTextArea();
	public JTextField inputTextArea = new JTextField();
	public JPanel JPan = new JPanel();
	public String current_input = "";

	public Console(){
		super();
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setContentPane(JPan);
		this.outputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.inputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		this.inputTextArea.addActionListener(this);
		this.JPan.setLayout(new BorderLayout());
		this.JPan.add(outputTextArea, BorderLayout.CENTER);
		this.JPan.add(inputTextArea, BorderLayout.SOUTH);
		this.outputTextArea.setEditable(false);
		this.setVisible(false);
	}
	
	public void setOutput(String str)
	{
		this.outputTextArea.setText(str);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.current_input = this.inputTextArea.getText();
		this.inputTextArea.setText("");
		this.outputTextArea.append(this.current_input);
	}
	
	public String getInput(){
		return this.current_input; 
	}


}
