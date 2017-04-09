package suite;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suite suite = new Suite();
		if(suite.play()){
			System.out.println("Bravo");
		}else{
			System.out.println("Dommage");
		}
	}

}
