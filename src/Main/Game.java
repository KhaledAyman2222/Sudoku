package Main;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Game {
    private static Stage GameStage;
    public static Stage getGameStage() {
        return GameStage;
    }

    public Game() throws Exception {
        GameStage=new Stage();
        GameStage.getIcons().add(new Image("images/sudoku.png"));
        GameStage.initStyle(StageStyle.DECORATED);
        Parent game = FXMLLoader.load(getClass().getResource("../Resources/Game.fxml"));
        GameStage.setResizable(false);
        GameStage.setTitle("Sudoku Game");
        GameStage.setScene(new Scene(game));
        GameStage.show();
        GameStage.setOnCloseRequest(windowEvent -> Main.main.show());
    }
}
