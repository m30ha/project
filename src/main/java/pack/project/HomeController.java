package pack.project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class HomeController {
    @FXML
    private GridPane grid;
    @FXML
    public void initialize() throws FileNotFoundException {
        grid.getChildren().clear();

        VBox productView1=productView(Product.Mango);
        grid.add(productView1, 0, 0);

        VBox productView2=productView(Product.Broccoli);
        grid.add(productView2, 1, 0);

        VBox productView3=productView(Product.Mushroom);
        grid.add(productView3, 2, 0);

    }
    public VBox productView(Product product) throws FileNotFoundException {
        VBox layout=new VBox();
        layout.setAlignment(Pos.CENTER);
        FileInputStream input=new FileInputStream("C:\\Users\\Asus\\Desktop\\project\\src\\main\\resources\\pack\\project\\"+product.getImageFile());
        Image image=new Image(input);
        ImageView imageView=new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        Label productName=new Label(product.name());
        Label  price=new Label(product.getPrice()+"$");
        Button addButton=new Button("Add To Cart");
        addButton.setUserData(product.name());
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Node sourceComponent=(Node)event.getSource();
                String productName=(String)sourceComponent.getUserData();
                ShoppingCart shoppingCart=ShoppingCart.getInstance();
                shoppingCart.addProduct(productName);
            }
        });
        layout.getChildren().addAll(imageView, productName, price, addButton);
        return layout;
    }
}
