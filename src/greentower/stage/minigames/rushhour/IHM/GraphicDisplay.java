package greentower.stage.minigames.rushhour.IHM;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import greentower.IO.Output;
import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.rushhour.Position;
import greentower.stage.minigames.shifumi.Sign;

/**
 * Implementation of Display for Graphics
 *
 * @author gavinr
 *
 */
public class GraphicDisplay extends JFrame implements Output
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
	public void showRushHourBoard(GameBoard board)
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

//	@Override
//	public void wrongDirection()
//	{
//		JOptionPane.showMessageDialog(this, "Wrong Direction");
//	}
//
//	@Override
//	public void win(int level)
//	{
//		String[] text = {"Replay", "Exit", "Next"};
//		int response = JOptionPane.showOptionDialog(this, "Congratulation", "WIN",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, text, text[0]);
//		if(response == 0){
//			new RushHourGame(new ConsolePlayer("Clement"), level, new GraphicDisplay()).playStage();
//			this.dispose();
//		}else if(response == 1){
//			RushHourGame.exit();
//		}else{
//			if(new File((level+1)+".txt").isFile() == false){
//				JOptionPane.showMessageDialog(this, "Congratulation you've finshed the game");
//				RushHourGame.exit();
//			}else{
//
//				new RushHourGame(new ConsolePlayer("Clement"), level+1, new GraphicDisplay()).playStage();
//				this.dispose();
//			}
//		}
//	}

	@Override
	public void showText(String str)
	{
		
	}

	@Override
	public void showError(String str)
	{
		
	}

	@Override
	public void notifyWin(int nbCoups, String motATrouver)
	{
		
	}

	@Override
	public void letterError()
	{
		
	}

	@Override
	public void notifyLoose(String motATrouver)
	{
		
	}

	@Override
	public void getChar()
	{
		
	}

	@Override
	public void showStageIntroduction(int stageIndex)
	{
		
	}

	@Override
	public void showStageEnd(int stageIndex)
	{
		
	}

	@Override
	public void gambling(int[] grid)
	{
		
	}

	@Override
	public void HeadsOrTails(int face)
	{
		
	}

	@Override
	public void LessOrMore(int number)
	{
		
	}

	@Override
	public void MasterMind()
	{
		
	}

	@Override
	public void Othello()
	{
		
	}

	@Override
	public void ShiFuMi(Sign player, Sign random)
	{
		
	}

	@Override
	public void Suite(int nb1, int nb2, int nb3, int nb4)
	{
		
	}

	@Override
	public void TicTacToe(int[][] grid)
	{
		
	}

	@Override
	public void showMiniGameResult(int result)
	{
		
	}

	@Override
	public void showPrompt()
	{
		
	}

	@Override
	public void showPendu(int nbErreur, String motAAfficher)
	{

		
	}

	@Override
	public void showDialog(String dialog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnswers(String answers) {
		// TODO Auto-generated method stub
		
	}


}
