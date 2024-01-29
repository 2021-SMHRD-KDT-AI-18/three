package mvc;
public class GameController {
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        model.initializeGame();

        while (model.getNextStage() <= 3) {
            view.displayRoundInfo(model.getNextStage());

            model.generateComNumber();
            view.displayComNumber(model.getCom());

            model.playGame();
            view.displayPlayerNumber(model.getPlayerNumber());

            model.updateCountsAndScores();
            view.displayResult(model.getCom(), model.getPlayerNumber(), model.getPlayer(), model.getMapPattern(),
                    model.getComWin(), model.getPlayerWin(), model.getDraw(), model.getCount());
        }
    }
}