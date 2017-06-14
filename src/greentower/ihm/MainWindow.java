package greentower.ihm;
import java.awt.Dimension;
/**
public class MainWindow extends JFrame implements ActionListener{
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = 1L;
	private JButton bt1;
	private JButton bt2;
	private Console console; 
	/**
	public MainWindow(){
		this.setTitle("The Green Tower Grinder");
		this.setSize(900, 600);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		try {
		this.setVisible(true);
		//Jpanel
		try {
		this.setVisible(true);
		//Bouton
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);
		this.getContentPane().add(this.bt1);
		this.getContentPane().add(this.bt2);
		this.setVisible(true);
		//Sound
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
		}
	}
}