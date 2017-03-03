import java.util.Arrays;

public class Dialog {
	
	public String text;
	public Choice[] choices;
	
	public Dialog(String text, Choice choices[]){
		this.text = text;
		this.choices = choices;
	}

	@Override
	public String toString() {
		String message = "Dialog [text=" + text + ", choices=";
		for(int i=0;i<4;i++){
			message = message + choices[i].text + " ";
		}
		message = message + "]";
		return message;
	}

	
	
	
	
}
