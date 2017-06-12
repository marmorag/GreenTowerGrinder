package greentower.stage.minigames.mastermind;
import java.util.Arrays;

/**
 * Combination(collection of pawns) which represents a solution or a try.
 *
 * @author delomeza
 *
 */
public class Combination {
	/**
	 * Defines combinations' default size
	 */
	private static final int DEFAULT_SIZE = 4;

	/**
	 * Attribute defines the combinations' storage
	 */
	private Color[] combination;


	/**
	 * @return the combination
	 */
	public Color[] getCombination() {
		return this.combination;
	}

	/**
	 * Creates a new combination, filled with random colors
	 * Default constructor
	 */
	public Combination()
	{
		this.combination = new Color[DEFAULT_SIZE];

		for (int counter = 0; counter < DEFAULT_SIZE; counter++)
		{
			this.combination[counter] = Color.getRandom();
		}
	}

	/**
	 * Creates a new combination, filled with given pawns
	 *
	 * @param tab Table of given pawns
	 */
	public Combination(Color[] tab)
	{
		this.combination = new Color[DEFAULT_SIZE];
		this.combination[0] = tab[0];
		this.combination[1] = tab[1];
		this.combination[2] = tab[2];
		this.combination[3] = tab[3];
	}


	/**
	 * @param proposition
	 * @return Checker
	 * 		   wp represents how many pawns are correctly set
	 *         mp represents how many pawns aren't correctly set)
	 *
	 *         Use to check how much a proposition looks like the result
	 *         expected
	 */
	public Checker check(Combination proposition)
	{

		boolean validInThis[] = { true, true, true, true };
		boolean validInOther[] = { true, true, true, true };

		int wp = 0; // Well placed
		int mp = 0; // Misplaced

		for(int indexThis = 0; indexThis < DEFAULT_SIZE; indexThis++)
		{
			if(this.combination[indexThis] == proposition.combination[indexThis])
			{
				wp++;
				validInOther[indexThis] = false;
				validInThis[indexThis] = false;
			}
		}

		for(int indexThis = 0; indexThis < DEFAULT_SIZE; indexThis++)
		{
			if(!validInThis[indexThis])
				continue;

			for(int indexOther = 0; indexOther < DEFAULT_SIZE; indexOther++)
			{
				if(!validInOther[indexOther])
					continue;

				if(this.combination[indexThis] == proposition.combination[indexOther])
				{
					mp++;
					validInThis[indexThis] = false;
					validInOther[indexOther] = false;
					break;
				}
			}
		}
		return new Checker(wp,mp);
	}


	@Override
	public String toString()
	{
		return "Combination [combination=" + Arrays.toString(this.combination) + "]"; //$NON-NLS-1$ //$NON-NLS-2$
	}

}
