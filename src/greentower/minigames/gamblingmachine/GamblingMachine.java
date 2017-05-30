package greentower.minigames.gamblingmachine;
import greentower.core.MiniGame;
import greentower.core.Stage;


/**
 * @author Florent & Rémi
 */
public class GamblingMachine extends MiniGame{

	/**
	 * @param id
	 */
	public GamblingMachine()
	{
	}

	/**
	 * Generate 3 random number between 0 and 2
	 * The player win if all 3 numbers and equals
	 * @return true if player wins false if not
	 */
	public Stage playStage(){
		boolean result;
		int[] grid = new int[3];
		grid[0] = (int)(Math.random() * (3-0)) + 0;
		grid[1] = (int)(Math.random() * (3-0)) + 0;
		grid[2] = (int)(Math.random() * (3-0)) + 0;

		if(grid[0] == grid[1] && grid[1] == grid[2]){
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = true;
		}else{
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			result = false;
		}

		if(result)
		{
			System.out.println("JACKPOT");
			return this.nextStages[0];
		}
		else
		{
			System.out.println("FAIL");
			return this.nextStages[1];
		}
	}
}
