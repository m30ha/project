package pack.project.project;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
//import model.Fruit;
import pack.project.OnlineShop;
import pack.project.model.Fruit;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class ItemController {
    @FXML
    private ImageView img;

    @FXML
    private ImageView img1;

    @FXML
    private Label nameLable;

    @FXML
    private Label priceLable;
    @FXML
    private Label fruitVisibleLabel;

    @FXML
    private Label valueLable;

    @FXML
    private ImageView valueimg;

    @FXML
    private void click(MouseEvent mouseEvent) throws URISyntaxException, IOException {
        myListener.onClickListener(fruit);
    }
    private Fruit fruit;
    private MyListener myListener;
    public void setData (Fruit fruit, MyListener myListener){
        this.fruit=fruit;
        this.myListener=myListener;
        priceLable.setText(fruit.getName());
        fruitVisibleLabel.setText(fruit.getRate());
        nameLable.setText(OnlineShop.CURRENCY+fruit.getPrice());
        Image image=new Image(Objects.requireNonNull(getClass().getResourceAsStream(fruit.getImgSrc())));
        img.setImage(image);
        Image image1=new Image(Objects.requireNonNull(getClass().getResourceAsStream(fruit.getImgValue())));
        img1.setImage(image1);
    }

}

