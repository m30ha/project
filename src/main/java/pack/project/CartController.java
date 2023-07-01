package pack.project;

import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.util.List;

public class CartController {
    @FXML
    private VBox cartPane;
    @FXML
    public void initialize(){
        List<CartEntry>entries=ShoppingCart.getInstance().getEntries();
        cartPane.getChildren().clear();
        if (entries.isEmpty()){
            javafx.scene.control.Label emptyLabel=new javafx.scene.control.Label("Empty cart");
            cartPane.getChildren().add(emptyLabel);
        }
        else {
            javafx.scene.control.Label shoppingCartTitle=new javafx.scene.control.Label("Empty cart");
            cartPane.getChildren().add(shoppingCartTitle);
            for (CartEntry cartEntry:entries){
                HBox hBox=new HBox();
                javafx.scene.control.Label productName=new javafx.scene.control.Label(cartEntry.getProduct().name());
                hBox.getChildren().add(productName);
                cartPane.getChildren().add(hBox);
            }
        }
    }
}
