package view;
import controller.ThreadId;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i ++) {
			Thread t = new ThreadId();
			t.start();
		}
	}

}
