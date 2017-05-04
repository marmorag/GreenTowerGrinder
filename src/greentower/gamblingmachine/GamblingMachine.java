package greentower.gamblingmachine;
import greentower.core.MiniGame;

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
	/**
	 * Generate 3 random number between 0 and 2
	 * The player win if all 3 numbers and equals
	 * @return true if player wins false if not
	 */
	public static boolean play(){
		int[] grid = new int[3];
		grid[0] = (int)(Math.random() * (3-0)) + 0;
		grid[1] = (int)(Math.random() * (3-0)) + 0;
		grid[2] = (int)(Math.random() * (3-0)) + 0;

		if(grid[0] == grid[1] && grid[1] == grid[2]){
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			return true;
		}else{
			System.out.println(grid[0]+"|"+grid[1]+"|"+grid[2]);
			return false;
		}
	}
}
