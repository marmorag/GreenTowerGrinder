package greentower.minigames.rushhour;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 * Implementation of Display for Graphics
 *
 * @author gavinr
 *
 */
public class GraphicDisplay extends JFrame implements Display
{

	/**
	 * Serial UID of the object
	 */
	private static final long serialVersionUID = -1967239576234716290L;
	private JTable table;

	/**
	 * Constructor
	 * Set default values for Swing
	 */
	public GraphicDisplay(){
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("RushHour");
	    this.setSize(600, 510);
	    this.setVisible(true);
	}

	@Override
	public void showBoard(GameBoard board)
	{
		Object[][] data = new Object[6][6];

	    for(int i=0;i<6;i++){
	    	for(int j=0;j<6;j++){
	    		int carNumber = board.getCarNumberAt(new Position(j,i));
	    		if(carNumber == -1)
	    			data[i][j]=  new JButton("");
	    		else
	    			data[i][j] = new JButton(String.valueOf(carNumber));
	    	}
	    }
	    String  title[] = {"", "","","","",""};

	    this.table = new JTable(data, title);
	    TableColumn col;
	    for(int i=0;i<this.table.getColumnCount();i++){
	    	col = this.table.getColumnModel().getColumn(i);
	    	col.setPreferredWidth(40);
	    	col.setCellRenderer(new ButtonRenderer());
	    	col.setCellEditor(new ButtonEditor(new JCheckBox()));
	    }
	    this.table.setRowHeight(80);
	    this.getContentPane().add(this.table);
	    this.revalidate();
	}

	@Override
	public void wrongDirection()
	{
		JOptionPane.showMessageDialog(this, "Wrong Direction");
	}

	@SuppressWarnings("unused")
	@Override
	public void win(int level)
	{
		JOptionPane d = new JOptionPane();
		String[] text = {"Replay", "Exit", "Next"};
		int response = d.showOptionDialog(this, "Congratulation", "WIN",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, text, text[0]);
		if(response == 0){
			new RushHourGame(new ConsolePlayer("Clement"), level, new GraphicDisplay()).play();
			this.dispose();
		}else if(response == 1){
			RushHourGame.exit();
		}else{
			if(new File((level+1)+".txt").isFile() == false){
				JOptionPane.showMessageDialog(this, "Congratulation you've finshed the game");
				RushHourGame.exit();
			}else{

				new RushHourGame(new ConsolePlayer("Clement"), level+1, new GraphicDisplay()).play();
				this.dispose();
			}
		}
	}


}
