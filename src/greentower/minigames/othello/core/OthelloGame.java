package greentower.minigames.othello.core;

import greentower.IO.Output;
import greentower.core.Dialog;
import greentower.core.ListOfStages;
import greentower.core.MiniGame;
import greentower.minigames.othello.ihm.IHMOthello;
import greentower.minigames.othello.ihm.console.IHMOthelloConsole;
import greentower.minigames.othello.player.Player;
import greentower.minigames.othello.player.console.ConsolePlayer;
import greentower.minigames.othello.player.random.RandomPlayer;

/**
 * This class represents a game of othello
 *
 * @author florent.viogne
 *
 */
public class OthelloGame extends MiniGame
{
	/**
	 * Players (black player is at 0)
	 */
	private final Player[] players;

	/**
	 * Board of the game
	 */
	private Board board;

	/**
	 * The IHM
	 */
	private IHMOthello IHM;

	/**
	 * Create a new game ready to play. Both players are ready Board is in
	 * initial configuration
	 * @param dialog 
	 * @param stageIndex 
	 */
	public OthelloGame(Dialog dialog, int stageIndex)
	{
		super(dialog, stageIndex);
		
		Player[] players = {new ConsolePlayer(), new RandomPlayer()};
		IHMOthello IHM = new IHMOthelloConsole();
		
		this.players = players;
		this.board = new Board();
		this.IHM = IHM;
	}


	/**
	 * Enables a player to play a round with given pawn's line, column and color
	 * @param currentPlayerColor
	 * 			The player's color who have to play this round
	 * @param pawnPosition
	 * 			The position where to place the pawn
	 */
	public void playARound(Color currentPlayerColor, Position pawnPosition)
	{
		  this.board.placeAPawn(currentPlayerColor, pawnPosition);
	}

	/**
	 * Know if given player can play or not
	 * @param currentPlayerNumber
	 * 			The player we have to check if he can play a round
	 * @return
	 * 			true if players can play, false if not
	 */
	public boolean playerCanPlay(int currentPlayerNumber)
	{
		for (int line = 0; line < Board.MAX_COORDINATE; line++)
			for (int column = 0; column < Board.MAX_COORDINATE; column++)
				if(this.board.actionIsValid(new Position(line,column), Color.values()[currentPlayerNumber]))
						return true;
		return false;

	}

	/**
	 * Play to the game
	 *
	 * Game's algorithm
	 * while (blackPlayer and whitePlayer are not both stuck) do
	 * {
	 * 		switch current player
	 * 		check if current player can play
	 * 			- no ->  player has not played / next turn
	 * 			- yes
	 * 		 		|->  do
	 * 						ask current player to choose a position where to drop a pawn
	 * 					while (position is not valid)
	 *                 	process pawn drop
	 * }
	 * @param display Display methods
	 * @return index of the nextStage
	 */
	public int playStage(Output display)
	{
		display.showStageIntroduction(ListOfStages.getStageIndex(this));
		display.showDialog(this.dialog);
		display.showText("RULES");
		display.showText("Tu vas jouer une partie d'Othello. Tu joues les pions noirs (B).");
		
		this.IHM.displayStartOfGame();

		int numberOfRound = 1;
		int currentPlayerNumber = 1;
		boolean lastPlayerCouldPlay = true;
		Position askedPosition = null;

		// Board display
		this.IHM.displayBoard(this.board);

		while(true)
		{
			// Switch current player
			currentPlayerNumber = (currentPlayerNumber + 1) % this.players.length;

			// Switch current player color
			Color currentPlayerColor = Color.values()[currentPlayerNumber];

			// Check is game is stuck or not
			if (!this.playerCanPlay(currentPlayerNumber))
			{
				if (!lastPlayerCouldPlay) break;
				lastPlayerCouldPlay = false;
				continue;
			}

			this.IHM.displayStartOfRound(currentPlayerColor, numberOfRound);

			// Ask position to play
			while (true)
			{
				this.IHM.displayInvitationForPosition(currentPlayerColor);
				askedPosition = this.players[currentPlayerNumber].askForPosition();
				if (this.board.actionIsValid(askedPosition, currentPlayerColor)) break;
				this.IHM.displayBoard(this.board);
				this.IHM.displayActionNotValid(askedPosition, currentPlayerColor);
			}

			this.IHM.displayPosition(askedPosition);

			this.playARound(currentPlayerColor, askedPosition);

			// Board display
			this.IHM.displayBoard(this.board);

			this.IHM.displayEndOfRound(numberOfRound);

			numberOfRound++;
		}

		this.IHM.displayResult(this.board.numberOfPawns(Color.BLACK), Color.BLACK);
		this.IHM.displayResult(this.board.numberOfPawns(Color.WHITE), Color.WHITE);

		int result;
		
		if(this.board.numberOfPawns(Color.WHITE) >= this.board.numberOfPawns(Color.BLACK))
			result = MiniGame.RESULT_VICTORY;
		else
			result = MiniGame.RESULT_LOOSE;
		
		display.showMiniGameResult(result);
		display.showStageEnd(ListOfStages.getStageIndex(this));
		return result;
	}
}
