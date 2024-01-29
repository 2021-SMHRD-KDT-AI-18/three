package mvc;
import java.util.List;
import java.util.Scanner;

public class view {
    private Scanner scanner;

    public view() {
        scanner = new Scanner(System.in);
    }

    public void displayCharacterAbility(int ability) {
        // Display character ability
        // ...
    }

    public int getPlayerInput() {
        // Get player input
        // ...
        return scanner.nextInt();
    }

    public void displayResult(String result) {
        // Display game result
        // ...
        System.out.println(result);
    }

    public void displayMatchPattern(String pattern) {
        // Display match pattern
        // ...
        System.out.println("맵패턴은 : " + pattern);
    }

    public void displayRemainingNumbers(List<Integer> remainingNumbers) {
        // Display remaining numbers
        // ...
    }
}