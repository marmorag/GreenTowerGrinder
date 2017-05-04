package greentower.core;

/**
 * This class represents a game of The Green Tower Grinder
 *
 * @author Florent
 *
 */
public class Game
{
	private Tower tower;
	private int numberOfRounds;
	private Player player;

	/**
	 * Default constructor
	 */
	public Game(String playerName)
	{
		this.tower = new Tower();
		this.numberOfRounds = 0;
		this.player = new Player(playerName);
	}

	/**
	 * Enables player to play the game
	 */
	public void play()
	{
		while(le joueur a pas perdu ET le joueur a pas gagné){
			jouer mini jeux
		}
		afficher fin de partie
	}

	/**
	 * Enables player to leave the current game
	 */
	public void leave()
	{
		System.exit(0);
	}

	/**
	 * Enables to change the current stage
	 */
	public void changeStage()
	{
		//TODO
	}
}
