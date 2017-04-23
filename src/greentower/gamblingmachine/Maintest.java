package greentower.gamblingmachine;

public class Maintest {

	public static void main(String[] args) {
			
		/*
		GamblingMachine.play();
		System.out.println(GamblingMachine.grid[0][0]+"|"+GamblingMachine.grid[0][1]+"|"+GamblingMachine.grid[0][2]);
		System.out.println(GamblingMachine.result);
		*/
		if(GamblingMachine.play())
			System.out.println("JACKPOT");
		else
			System.out.println("FAIL");
	}
	
}
