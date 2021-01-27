package edu.ib;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class choosePlayersController {

    @FXML
    private StackPane secondScenePanel;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;


    @FXML
    private void fourPlayers(ActionEvent event) {

    }


    @FXML
    private void threePlayers(ActionEvent event) {

    }

    @FXML
    private void twoPlayers(ActionEvent event) {
        makeFadeOutTwoPlayers();
    }

    @FXML
    void initialize() {
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'choosePlayers.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'choosePlayers.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'choosePlayers.fxml'.";
    }

    private void makeFadeOutTwoPlayers() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setNode(secondScenePanel);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);

        fadeTransition.setOnFinished(event -> loadGameScene());
        fadeTransition.play();
    }

    private void loadGameScene(){

        try {
            Parent thirdView;
            thirdView = (StackPane) FXMLLoader.load(getClass().getResource("/fxml/Game.fxml"));

            Scene gameScene = new Scene(thirdView);
            Stage curStage1 = (Stage) secondScenePanel.getScene().getWindow();
            curStage1.setScene(gameScene);

        } catch (IOException e){
            Logger.getLogger(choosePlayersController.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
