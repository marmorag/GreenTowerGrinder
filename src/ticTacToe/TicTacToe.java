package ticTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	private final static int PLAYER = 1;
	private final static int GAME = 0;
	
	private int[][] grid = new int [3][3];
	private int winner;
	
	public TicTacToe(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				this.grid[i][j] = 0;
			}
		}
	}
	
	public boolean PlayerTurn(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int p1=0,p2=0;
		while(true){
			p1 = Integer.parseInt(sc.nextLine());
			p2 = Integer.parseInt(sc.nextLine());
			if(this.grid[p1][p2] == 0){
				this.grid[p1][p2] = 1;
				break;
			}
			System.out.println("Cette case n'est pas vide");
		}
		if(this.grid[p1][0] == 1 && this.grid[p1][1] == 1 && this.grid[p1][2] == 1){
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[0][p2] == 1 && this.grid[1][p2] == 1 && this.grid[2][p2] == 1){
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[0][0] == 1 && this.grid[1][1] == 1 && this.grid[2][2] ==1){
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[2][0] == 1 && this.grid[1][1] == 1 && this.grid[0][2] == 1){
			this.winner = GAME;
			return true;
		}
		return false;
	}
	
	public boolean GameTurn(){
		int p1 = 0,p2 = 0;
		Random r = new Random();
		while(true){
			p1 = (int) r.nextInt(3);
			p2 = (int) r.nextInt(3);
			if(this.grid[p1][p2] == 0){
				this.grid[p1][p2] = 2;
				break;
			}
		}
		System.out.println("ok");
		if(this.grid[p1][0] == 2 && this.grid[p1][1] == 2 && this.grid[p1][2] == 2){
			this.winner = GAME;
			return true;
		}
		if(this.grid[0][p2] == 2 && this.grid[1][p2] == 2 && this.grid[2][p2] == 2){
			this.winner = GAME;
			return true;
		}
		if(this.grid[0][0] == 2 && this.grid[1][1] == 2 && this.grid[2][2] ==2){
			this.winner = GAME;
			return true;
		}
		if(this.grid[2][0] == 2 && this.grid[1][1] == 2 && this.grid[0][2] == 2){
			this.winner = GAME;
			return true;
		}
		return false;
	}
	
	public int getWinner(){
		return this.winner;
	}

	@Override
	public String toString() {
		return this.grid[0][0]+"|"+this.grid[0][1]+"|"+this.grid[0][2]+"|\n"+
				this.grid[1][0]+"|"+this.grid[1][1]+"|"+this.grid[1][2]+"|\n"+
				this.grid[2][0]+"|"+this.grid[2][1]+"|"+this.grid[2][2]+"|\n";
	}
	
	
	
}
