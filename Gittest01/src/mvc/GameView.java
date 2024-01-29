package mvc;

import java.util.Scanner;

public class GameView {
	private Scanner sc;

	public void View() {
        sc = new Scanner(System.in);
    }

	public void displayMessage(String message) {
		System.out.println(message);
	}

	public int getPlayerInput() {
		return sc.nextInt();
	}

	// Add other methods for displaying game information
}
