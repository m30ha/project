package pack.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HomeView {
    private Parent view;
    public HomeView() throws IOException {
        URL url=new File("C:\\Users\\Asus\\Desktop\\project\\src\\main\\java\\pack\\project\\home.fxml").toURI().toURL();
        Parent root=FXMLLoader.load(url);
        this.view=root;
    }
    public Parent getView(){
        return view;
    }
}
