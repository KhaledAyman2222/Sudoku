package Controllers;

import Main.Game;
import Main.HowToPlay;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HowToPlayController {

    @FXML
    private Button backbtn;
    @FXML
    private void BackPE() {
        backbtn.setTranslateY(2);
    }
    @FXML
    private void BackRE() {
        backbtn.setTranslateY(0);
    }

    @FXML
    private void RedirectToGame() {
        HowToPlay.getHowToPlayStage().close();
        Game.getGameStage().setOpacity(1);
    }
}
