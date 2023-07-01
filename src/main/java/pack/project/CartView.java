package pack.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class CartView {
    private Parent view;
    public CartView() throws IOException {
        URL uiFile=new File("C:\\Users\\Asus\\Desktop\\project\\src\\main\\java\\pack\\project\\cart.fxml").toURI().toURL();
        Parent root=FXMLLoader.load(uiFile);
        this.view=root;
    }
    public Parent getView(){
        return this.view;
    }
}
