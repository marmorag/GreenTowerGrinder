package greentower.IO;

import greentower.stage.choice.Answers;
import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.shifumi.Sign;

/**
 * @author Florent
 *
 */
public class OutputGraphicChoice implements Output {

	@Override
	public void showDialog(Dialog dialog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showText(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void erreurLettre() {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyLoose(String motATrouver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void demanderCaractere() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showPendu(int nbErreur, String motAAfficher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showStageIntroduction(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gambling(int[] grid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HeadsOrTails(int face) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LessOrMore(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShiFuMi(Sign player, Sign random) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Suite(int nb1, int nb2, int nb3, int nb4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TicTacToe(int[][] grid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showMiniGameResult(int result)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPrompt()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnswers(Answers answers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showRushHourBoard(GameBoard board) {
		// TODO Auto-generated method stub
		
	}

}
