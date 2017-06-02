package greentower.stage.minigames.mastermind;
/**
 * Represents Checkers
 *Permit to verify the player's tries to find the good combination
 *
 * @author delomeza
 *
 */
public class Checker {

/**
 * indicate the pawns whose aren't set correctly
 */
	private final int wellPlaced;

/**
 * indicate the correctly set pawns
 */
	private final int misplaced;


	/**
	 * Creates a checker used to indicate how muck a proposition looks like the result expected
	 * @param theWellPlaced represents the correctly set pawns
	 * @param theMisplaced represents the pawns misplaced
	 */
	public Checker(int theWellPlaced, int theMisplaced)
	{
		this.wellPlaced = theWellPlaced;
		this.misplaced = theMisplaced;
	}


	/**
	 * ACCESSOR
	 * @return The number of well placed pawns
	 */
	public int getWellPlaced()
	{
		return this.wellPlaced;
	}


	/**
	 * ACCESSOR
	 * @return The number of miss placed pawns
	 */
	public int getMisplaced()
	{
		return this.misplaced;
	}
	
	@Override
	public String toString()
	{
		return ""+this.wellPlaced+ " pion(s) bien placé(s) ; "+this.misplaced+" pion(s) mal placé(s)";  //$NON-NLS-1$ //$NON-NLS-2$//$NON-NLS-3$
	}


	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.misplaced;
		result = prime * result + this.wellPlaced;
		return result;
	}


	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Checker other = (Checker) obj;
		if (this.misplaced != other.misplaced)
			return false;
		if (this.wellPlaced != other.wellPlaced)
			return false;
		return true;
	}
}
