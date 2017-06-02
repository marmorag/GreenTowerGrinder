package greentower.IO;

import greentower.ihm.MainWindow;
import greentower.stage.choice.Answers;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;
import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.rushhour.Position;
import greentower.stage.minigames.shifumi.Sign;

/**
 * @author Guillaume
 *
 */
public class OutputGraphic implements Output{

	/**
	 * 
	 */
	protected MainWindow mainWindow;
	
	/**
	 * This is the display windows
	 */
	public OutputGraphic()
	{
		this.mainWindow = new MainWindow();
	}
	
	@Override
	public void showDialog(Dialog dialog) {
		this.mainWindow.console.setOutput(dialog.toString());
	}

	@Override
	public void showText(String str) {
		this.mainWindow.console.setOutput(str);
	}
	
	// PENDU
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		String str = "Felicitations vous avez réussi en : "+ nbCoups +"coups\n"+"Le mot était :"+motATrouver+"\n";		
		this.mainWindow.console.setOutput(str);
	}

	@Override
	public void erreurLettre() {
		this.mainWindow.console.setOutput("\nLa lettre n'est pas contenu dans le mot!\n");
		
	}

	@Override
	public void notifyLoose(String motATrouver) {
		this.mainWindow.console.setOutput("Dommage vous avez perdu"+"Le mot était :"+motATrouver+"\n");
	}

	@Override
	public void demanderCaractere() {
		this.mainWindow.console.setOutput("\nVotre lettre :");
	}

	@Override
	public void showPendu(int nbErreur, String motAAfficher) {
		String str = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

		switch(nbErreur){

			case 0 :
				str = str +"\n\n\n\n\n\n\n\n";
				break;
			case 1 :
				str = str +"\n\n\n\n\n\n\n\n      ============\n";
				break;
			case 2 :
				str = str +"\n         ||\n         ||\n         ||\n         ||\n         ||\n" +
						"        /||\n       //||\n      ============\n";

				break;
			case 3 :
				str = str +"         ,==============\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"+"         ||\n"
						+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 4 :
				str = str +"         ,==========Y===\n"+"         ||         |\n"+"         ||         |\n"+"         ||\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 5 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 6 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 7 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||         |\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 8 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\n"+"         ||\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 9 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\\\n"+"         ||        / \n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			case 10 :
				str = str +"         ,==========Y===\n"+"         || /       |\n"+"         ||/        |\n"+"         ||         O\n"+
						"         ||        /|\\\n"+"         ||        /|\n"+"        /||\n"+"       //||\n"+"      ============\n";
				break;
			default :
				str = str +"ERREUR_AFFICHAGE_PENDU";
				break;
		}
		str = str +"Le mot a trouver :"+motAAfficher+"\n";
		this.mainWindow.console.setOutput(str);
		
	}

	@Override
	public void showStageIntroduction(int stageIndex) {
		String str = "\n***************************************************\n"
					+"------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------\n"
					+"***************************************************\n" ;
		this.mainWindow.console.setOutput(str);
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
		String str = "\n***************************************************\n"
				+"------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------\n"
				+"***************************************************\n" ;
		this.mainWindow.console.setOutput(str);
//		try
//		{
//			Thread.sleep(1000);
//		} catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.mainWindow.console.setText("");
		
	}

	@Override
	public void MasterMind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Othello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError(String str) {
		System.err.println(str);
		this.mainWindow.console.setOutput("\n\n"+str);
		
	}

	@Override
	public void gambling(int[] grid) {
		this.mainWindow.console.setOutput("\n"+grid[0]+"|"+grid[1]+"|"+grid[2]);
	}

	@Override
	public void HeadsOrTails(int face) {
		// TODO Demander Rémi
		
	}

	@Override
	public void LessOrMore(int number) {
		String str = "\nRULES" +
		"\nTu vas devoir devoir deviné si le prochain nombre entre 1 et 10 sera plus grand ou plus petit que celui affiché" +
		"\nMORE: plus grand "+
		"LESS: plus petit" +
		"\nLe nombre est : "+number;
		
		this.mainWindow.console.setOutput(str);
	}

	@Override
	public void ShiFuMi(Sign player, Sign random) {
		this.mainWindow.console.setOutput(String.valueOf(player)+" VS "+String.valueOf(random));
		
	}

	@Override
	public void Suite(int nb1, int nb2, int nb3, int nb4) {
		String str = "Arriverez-vous à  trouver la suite ?\n";
		str = str +String.valueOf(nb1)+" "+String.valueOf(nb2)+" "+String.valueOf(nb3)+" "+String.valueOf(nb4)+" ?";
		
	}

	@Override
	public void TicTacToe(int[][] grid) {
		String str = grid[0][0]+"|"+grid[0][1]+"|"+grid[0][2]+"\n"
					+grid[1][0]+"|"+grid[1][1]+"|"+grid[1][2]+"\n"
					+grid[2][0]+"|"+grid[2][1]+"|"+grid[2][2]+"\n";
		this.mainWindow.console.setOutput(str);
	}

	@Override
	public void showMiniGameResult(int result)
	{
		String str = OutputConsole.gotN(2);
		if (result == MiniGame.RESULT_VICTORY)
		{
			str = str +"\nFéliciations tu as gagné le mini-jeu.";
		}
		else
		{
			str = str + "\nDommage, tu as perdu";
		}
		str = str + "\nRendez-vous au prochain étage";
		
		this.mainWindow.console.setOutput(str);		
	}

	@Override
	public void showPrompt()
	{
		this.mainWindow.console.updateFocus();
		//this.mainWindow.console.setInput("\n> ");
	}

	@Override
	public void showAnswers(Answers answers) {
		this.mainWindow.console.setOutput(answers.toString());
		
	}

	@Override
	public void showRushHourBoard(GameBoard board) {
		String grid="";
		for(int y=0;y<GameBoard.BOARD_WIDTH;y++){
			grid += "*************************\n*";
			for(int x=0;x<GameBoard.BOARD_HEIGHT;x++){
				int carNumber = board.getCarNumberAt(new Position(x,y));
				if(carNumber != -1){
					grid += " "+carNumber+" *";
				}else{
					grid += "   *";
				}
			}
			grid += "\n";
		}
		grid += "*************************\n";
		this.mainWindow.console.setOutput(grid);		
	}
	
	//GamblingMachine

}
