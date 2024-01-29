package mvc;

import java.util.Random;

public class controller {
    private gameModel model;
    private view view;
    private Random random;

    public controller(gameModel model, view view) {
        this.model = model;
        this.view = view;
        this.random = new Random();
    }

    public void startGame() {
        while (model.getNextStage() <= 3) {
            model.initializeGame();
            view.displayCharacterAbility(model.getNextStage());
            playRounds();
        }
    }

    private void playRounds() {
        // Logic for playing rounds
        while (model.getCount() < 9) {
            model.playRound();
            view.displayMatchPattern(Integer.toString(model.getMapPattern()));
            view.displayRemainingNumbers(model.getPlayerNumber());
            int select = view.getPlayerInput();
            // ...
            // More logic for playing a round
            // ...
        }

        // Display final result and update next stage
        // ...
    }
}