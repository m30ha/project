package pack.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class OnlineShop extends Application {
    public static final String CURRENCY="$";

    @Override
    public void start(Stage stage) throws Exception{

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("site.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("MAT shop");
//            Image image = new Image("pack.project/icons8-java-64.png");
//            stage.getIcons().add(image);
            stage.show();
        }


    public static void main(String[] args) {
        launch(args);
    }
}