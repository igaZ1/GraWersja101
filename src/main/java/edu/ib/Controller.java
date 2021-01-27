package edu.ib;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;

import static edu.ib.Main.*;


//import java.awt.*;


public class Controller {

    @FXML
    private ImageView jebaclegie;

    @FXML
    private ImageView botojebanechuje;

    @FXML
    private Button sranieDoRyja;





    @FXML
    void initialize() {
        System.out.println("plany planiki motywy motywiki");
        Image  image = new Image("fxml/cards/aceofclubs.png");
        ImageView imageView = new ImageView(image);

        jebaclegie.setImage(image);
        jebaclegie.onMouseClickedProperty();
//        ImageView view = new ImageView(image);
//        Button button = new Button();
//        //Setting the location of the button
//        button.setTranslateX(200);
//        button.setTranslateY(25);
        imageView.setFitHeight(90);
        imageView.setFitWidth(90);
        sranieDoRyja.setPrefSize(90, 90);
//        button.setGraphic(imageView);
        sranieDoRyja.setGraphic(imageView);




    }

    public void jebacSmolalskiego(ActionEvent actionEvent) {
        jebaclegie.setImage(damaTrefl);
        widokKrolaTrefl.setFitHeight(90);
        widokKrolaTrefl.setFitWidth(90);
        sranieDoRyja.setPrefSize(90, 90);
        sranieDoRyja.setGraphic(widokKrolaTrefl);
    }

    public void iCalaRodzineJEgo(DragEvent dragEvent) {
        jebaclegie.setImage(krolTrefl);
    }
}
