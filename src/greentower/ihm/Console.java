package greentower.ihm;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Console extends OutputStream {

	private JFrame frame;
	public static JTextArea console;
	private JTextArea entree;

	public Console(JTextArea control ){

		frame = new JFrame();

		frame.setTitle("The Green Tower Grinder");
		frame.setSize(900, 600);
		//frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		console = control;

		console=new JTextArea();
		console.setEditable(false);
		entree = new JTextArea();
		entree.setEditable(true);




		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(new JScrollPane(console),BorderLayout.CENTER);
		frame.getContentPane().add(new JScrollPane(entree),BorderLayout.SOUTH);

		frame.setVisible(true);	}	

		public void write( int b ) throws IOException {
			// append the data as characters to the JTextArea control
			console.append( String.valueOf( ( char )b ) );
		}  
	}

