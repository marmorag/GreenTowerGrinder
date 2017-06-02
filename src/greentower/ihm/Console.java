package greentower.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Console extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextArea outputTextArea = new JTextArea();
	
	public JTextArea inputTextArea = new JTextArea();

	public Console(){
		super();
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		JPanel test = new JPanel();
		this.setContentPane(test);
		outputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		inputTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		test.setLayout(new BorderLayout());
		test.add(outputTextArea, BorderLayout.CENTER);
		test.add(inputTextArea, BorderLayout.SOUTH);
		outputTextArea.setEditable(false);
		this.setVisible(false);
	}
	
	public void setOutput(String str)
	{
		this.outputTextArea.setText(str);
	}


}
