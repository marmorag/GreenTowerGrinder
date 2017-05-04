package greentower.gamblingmachine;
import greentower.core.MiniGame;
import greentower.core.Stage;

/*public class GamblingMachine {

	public static int[][] grid = new int [1][3];
	public static String result;

	public static void play(){

		grid[0][0]=(int)(Math.random() * (3-0)) + 0;
		grid[0][1]=(int)(Math.random() * (3-0)) + 0;
		grid[0][2]=(int)(Math.random() * (3-0)) + 0;


		if ((grid[0][0] == grid[0][1]) && (grid[0][0]== grid[0][2])){
			result="JACKPOT !";
		}
		else{
			result="FAIL :/";
		}
	}
}*/

/**
 * @author Florent & Rémi
 */
public class GamblingMachine extends MiniGame{

	public GamblingMachine(int id)
	{
		super(id);
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
