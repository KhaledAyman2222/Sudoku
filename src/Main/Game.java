package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Game {
    private static Stage GameStage;
    public static Stage getGameStage() {
        return GameStage;
    }
    public Game() throws Exception {
        GameStage=new Stage();
        GameStage.initStyle(StageStyle.UNDECORATED);
        Parent game = FXMLLoader.load(getClass().getResource("../Resources/Game.fxml"));
        GameStage.setResizable(false);
        GameStage.setTitle("Sudoku Game");
        GameStage.setScene(new Scene(game));
        GameStage.show();
    }
}