package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private final static int PLAYER = 1;
	private final static int GAME = 0;
	
	private int[][] grid = new int [3][3];
	private int winner;
	
	
	public boolean PlayerTurn(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int p1 = Integer.parseInt(sc.nextLine());
		int p2 = Integer.parseInt(sc.nextLine());
		
		if(this.grid[p1][0] == 1 && this.grid[p1][1] == 1 && this.grid[p1][2] == 1){
			this.winner = PLAYER;
			return true;
		}
		if(this.grid[0][p2] == 1 && this.grid[1][p2] == 1 && this.grid[2][p2] == 1){
			this.winner = PLAYER;
			return true;
		}
		//Condition pour la diagonale
		return false;
	}
	
	public boolean GameTurn(){
		boolean b = false;
		int p1 = 0,p2 = 0;
		while(b == false){
			p1 = (int) Math.random() * 3;
			p2 = (int) Math.random() * 3;
			if(this.grid[p1][p2] == 0){
				this.grid[p1][p2] = 2;
				this.winner = GAME;
				b = true;
			}
		}
		if(this.grid[p1][0] == 2 && this.grid[p1][1] == 2 && this.grid[p1][2] == 2){
			this.winner = GAME;
			return true;
		}
		if(this.grid[0][p2] == 2 && this.grid[1][p2] == 2 && this.grid[2][p2] == 2){
			this.winner = GAME;
			return true;
		}
		//Condition pour la diagonale
		return false;
	}
	
	public int getWinner(){
		return this.winner;
	}
	
}
