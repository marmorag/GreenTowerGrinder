package greentower.suite;

public class MainTest {

	public static void main(String[] args) {
		Suite suite = new Suite();
		if(suite.play()){
			System.out.println("Bravo");
		}else{
			System.out.println("Dommage");
		}
	}

}
