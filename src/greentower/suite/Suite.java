package greentower.suite;

import java.util.Random;
import java.util.Scanner;
/**
 * Find the fifth number
 * @author Rémi
 *
 */
public class Suite {

	/**
	 * Numbers
	 */
	private int nb1,nb2,nb3,nb4,nb5;
	/**
	 * Operations
	 */
	private int op1,op2;
	
	/**
	 * Initialize random first number and operations
	 * Then deduce others numbers
	 */
	public Suite(){
		Random r = new Random();
		op1 = r.nextInt(11);
		op2 = r.nextInt(11);
		nb1 = r.nextInt(11);
		nb2 = nb1*op1+op2;
		nb3 = nb2*op1+op2;
		nb4 = nb3*op1+op2;
		nb5 = nb4*op1+op2;
	}
	
	/**
	 * Display 4 first number and let player enter his result
	 * @return {boolean} if the player win or not
	 */
	public boolean play(){
		System.out.println(this.toString());
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int result = Integer.parseInt(sc.nextLine());
		return result == nb5;
	}

	@Override
	public String toString() {
		return "Suite [" + nb1 + " " + nb2 + " " + nb3 + " " + nb4 + " ?]";
	}
	
	
}
