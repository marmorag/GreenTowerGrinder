package greentower.tictactoe;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe ttt = new TicTacToe();
		System.out.println(ttt.toString());
		while(true){
			if(ttt.PlayerTurn())
				break;
			System.out.println(ttt.toString());
			if(ttt.GameTurn())
				break;
			System.out.println(ttt.toString());
		}
		System.out.println(ttt.toString());
		if(ttt.getWinner() == 1)
		{
			System.out.println("Bravo");
		}else{
			System.out.println("Dommage");
		}
	}

}
