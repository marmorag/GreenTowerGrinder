package greentower.minigames.suite;

import greentower.core.*;
import java.util.Random;
import java.util.Scanner;
/**
 * Find the fifth number
 * @author Rémi
 *
 */
public class Suite extends MiniGame{

	/**
	 * Numbers
	 */
	@SuppressWarnings("javadoc")
	private int nb1,nb2,nb3,nb4,nb5;
	/**
	 * Operations
	 */
	@SuppressWarnings("javadoc")
	private int op1,op2;

	/**
	 * Initialize random first number and operations
	 * Then deduce others numbers
	 */
	public Suite()
	{
		Random r = new Random();
		this.op1 = r.nextInt(11);
		this.op2 = r.nextInt(11);
		this.nb1 = r.nextInt(11);
		this.nb2 = this.nb1 * this.op1 + this.op2;
		this.nb3 = this.nb2 * this.op1 + this.op2;
		this.nb4 = this.nb3 * this.op1 + this.op2;
		this.nb5 = this.nb4 * this.op1 + this.op2;
	}

	/**
	 * Display 4 first number and let player enter his result
	 * @return {boolean} if the player win or not
	 */
	public int playStage(){
		System.out.println(this.toString());
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int result = Integer.parseInt(sc.nextLine());

		if(result == this.nb5)
		{
			System.out.println("Bravo");
			return 0;
		}
		else
		{
			System.out.println("Dommage");
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Suite [" + this.nb1 + " " + this.nb2 + " " + this.nb3 + " " + this.nb4 + " ?]";
	}


}
