package gamblingmachine;

public class GamblingMachine {

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
}
