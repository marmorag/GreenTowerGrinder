package ticTacToe;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe ttt = new TicTacToe();
		while(true){
			if(ttt.PlayerTurn())
				break;
			if(ttt.GameTurn())
				break;
		}
		if(ttt.getWinner() == 1){
			System.out.println("Bravo");
		}else{
			System.out.println("Dommage");
		}
	}

}
