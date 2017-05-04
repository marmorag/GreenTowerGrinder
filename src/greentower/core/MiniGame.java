package greentower;
/**
 * This class represents Mini Game' basement
 * 
 * @author Axelle
 *
 */
public abstract class MiniGame{

	/**
	 * Game's identifier
	 */
	private int id ;

	/**
	 * Game's name
	 */
	private String name ;
	
	/**
	 * Mini Game's contructor
	 * @param number
	 * @param name
	 */
	public MiniGame(int number, String name){
		this.id = number;
		this.name = name;
	}
	
	/**
	 * Allows to play game
	 */
	protected boolean play(){
		return false;
		
	}

	/**
	 * Allows to display who won the game
	 */	
	protected void displayWinner(){
		if(this.play())
			System.out.println("Le joueur a gagné");
		else
			System.out.println("L'ordinateur a gagné");
	}
	
	
}
