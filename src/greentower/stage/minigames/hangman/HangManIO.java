package greentower.stage.minigames.hangman;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import greentower.IO.Input;
import greentower.IO.Output;
import greentower.stage.minigames.rushhour.Direction;
import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.shifumi.Sign;

/**
 * 
 * @author Guillaume
 *
 */
public class HangManIO extends JFrame implements Input, Output
{
	/**
	 * The panel where to display anything
	 */
	private HangmanIHM hangmanPanel;
	
	/**
	 * @param hangmanPanel
	 */
	public HangManIO(HangmanIHM hangmanPanel)
	{
		this.hangmanPanel = hangmanPanel;
		
		this.setSize(900,620);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(this.hangmanPanel);
		this.setVisible(true);
		
	}

	/* ************************************************* Below, the methods of the Ouput Interface ********************************************************** */
	
	
	@Override
	public void showDialog(String dialog)
	{
		
	}

	@Override
	public void showText(String str)
	{
		
	}

	@Override
	public void showError(String str)
	{
		
	}

	@Override
	public void showAnswers(String answers)
	{
		
	}

	@Override
	public void notifyWin(int nbTurns, String wordToFind)
	{
		this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_victory.png").getImage());
		this.hangmanPanel.setWordToFind(wordToFind);
	}

	@Override
	public void letterError()
	{
		
	}

	@Override
	public void notifyLoose(String wordToFind)
	{
		this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_dead.png").getImage());
		this.hangmanPanel.setWordToFind(wordToFind);
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
	public void showRushHourBoard(GameBoard board)
	{
		

	}

	@Override
	public void showHangman(int errorNumber, String wordToDisplay)
	{
		switch(errorNumber){

			case 0 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_void.png").getImage());
				break;
			case 1 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step1.png").getImage());
				break;
			case 2 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step2.png").getImage());
				break;
			case 3 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step3.png").getImage());
				break;
			case 4 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step4.png").getImage());
				break;
			case 5 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step5.png").getImage());
				break;
			case 6 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step6.png").getImage());
				break;
			case 7 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step7.png").getImage());
				break;
			case 8 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step8.png").getImage());
				break;
			case 9 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step9.png").getImage());
				break;
			case 10 :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_step10.png").getImage());
				break;
			default :
				this.hangmanPanel.setImageTo(new ImageIcon("images/hangman/hangman_error.png").getImage());
				break;
		}
		
		this.hangmanPanel.setWordToFind(wordToDisplay);
		this.hangmanPanel.setNbErrTo(errorNumber);

	}

	/* ************************************************* Below, the methods of the Input Interface ********************************************************** */
	
	@Override
	public char inputChar()
	{
		while(!HangmanIHM.isPressed)
		{
			try
			{Thread.sleep(100);} 
			catch (InterruptedException e)
			{}
		}
		return this.hangmanPanel.getInputedChar();
	}

	@Override
	public int inputInt()
	{
		
		return 0;
	}

	@Override
	public String inputString()
	{
		
		return null;
	}

	@Override
	public int getCar(GameBoard board)
	{
		
		return 0;
	}

	@Override
	public Direction getDirection()
	{
		
		return null;
	}

	@Override
	public int getMove()
	{
		
		return 0;
	}

}
