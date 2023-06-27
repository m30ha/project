package pack.project.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//import model.Fruit;
import pack.project.OnlineShop;
import pack.project.model.Fruit;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class MarketController implements Initializable {
    @FXML
    private  Button BestSellingButton;

    @FXML
    private  Button DairyButton;

    @FXML
    private  Button EfficientButton;

    @FXML
    private  Button FruitButton;

    @FXML
    private  Button HighQualityButton;

    @FXML
    private  Button VegetablesButton;
    @FXML
    private  Button MyAccountButton;
    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Label fruitNameLabel;

    @FXML
    private  Label setVisible;
    @FXML
    private Label fruitPriceLabel;

    @FXML
    private Label fruitVisibleLabel;

    @FXML
    private Label fruitGroupingLabel;
    @FXML
    private ImageView fruitValueLabel;
    @FXML
    private ImageView fruitImg;

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[] number={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    public Stage stage;
    private List<Fruit> fruits=new ArrayList<>();
    private Image image;
    private Image image2;
    private MyListener myListener;
    public int b=0;
    public void rate(Fruit fruit){
        String s=fruit.getRate();
        if (s.equals("1")) {
            fruit.setValue("1 rate icon.PNG");
            fruit.setImgValue("Awful icon.Gif");
        }
        if (s.equals("2")){
            fruit.setValue("2 rate icon.PNG");
            fruit.setImgValue("Sad icon.Gif");
        }
        if (s.equals("3")) {
            fruit.setValue("3 rate icon.PNG");
            fruit.setImgValue("Okay icon.Gif");
        }
        if (s.equals("4")) {
            fruit.setValue("4 rate icon.PNG");
            fruit.setImgValue("Good icon.Gif");
        }
        if (s.equals("5")) {
            fruit.setValue("5 rate icon.PNG");
            fruit.setImgValue("Awesome icon.Gif");
        }
    }
    private void VegetablesButton(javafx.event.ActionEvent event){
        b=1;
    }

    public List<Fruit> getData() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;

        fruit = new Fruit();
        fruit.setName("Mango");
        fruit.setGroup("Fruit");
        fruit.setPrice(3.55);
        fruit.setImgSrc("Mango.PNG");
        fruit.setRate("2");
        rate(fruit);
        fruit.setColor("F6C313");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Coconut");
        fruit.setGroup("Fruit");
        fruit.setPrice(1.55);
        fruit.setRate("4");
        rate(fruit);
        fruit.setImgSrc("Coconut.PNG");
        fruit.setColor("BDAA8C");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Pitaya");
        fruit.setGroup("Fruit");
        fruit.setPrice(5.95);
        fruit.setImgSrc("Pitaya.PNG");
        fruit.setRate("3");
        rate(fruit);
        fruit.setColor("D20455");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Blueberry");
        fruit.setGroup("Fruit");
        fruit.setPrice(3.55);
        fruit.setImgSrc("Blueberry.PNG");
        fruit.setRate("5");
        rate(fruit);
        fruit.setColor("5662F6");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Lemon");
        fruit.setGroup("Fruit");
        fruit.setPrice(3.05);
        fruit.setImgSrc("Lemon.PNG");
        fruit.setRate("1");
        rate(fruit);
        fruit.setColor("FFF24D");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Avocado");
        fruit.setGroup("Fruit");
        fruit.setPrice(3.99);
        fruit.setImgSrc("Avocado.PNG");
        fruit.setRate("4");
        rate(fruit);
        fruit.setColor("67B279");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Raspberry");
        fruit.setGroup("Fruit");
        fruit.setPrice(2.55);
        fruit.setImgSrc("Raspberry.PNG");
        fruit.setRate("3");
        rate(fruit);
        fruit.setColor("DC0B0B");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Passion fruit");
        fruit.setGroup("Fruit");
        fruit.setPrice(5.99);
        fruit.setImgSrc("Passion fruit.PNG");
        fruit.setRate("5");
        rate(fruit);
        fruit.setColor("E3DB94");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Peach");
        fruit.setGroup("fruit");
        fruit.setPrice(2.99);
        fruit.setImgSrc("Peach.PNG");
        fruit.setRate("1");
        rate(fruit);
        fruit.setColor("F16C31");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Broccoli");
        fruit.setGroup("vegetable");
        fruit.setPrice(1.95);
        fruit.setImgSrc("Broccoli.PNG");
        fruit.setRate("3");
        rate(fruit);
        fruit.setColor("D6B3E5");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Bell pepper");
        fruit.setGroup("vegetable");
        fruit.setPrice(2.79);
        fruit.setImgSrc("Bell pepper.PNG");
        fruit.setRate("5");
        rate(fruit);
        fruit.setColor("815A3B");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Lettuce");
        fruit.setGroup("vegetable");
        fruit.setPrice(0.95);
        fruit.setImgSrc("Lettuce.PNG");
        fruit.setRate("2");
        rate(fruit);
        fruit.setColor("829040");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Pumpkin");
        fruit.setGroup("vegetable");
        fruit.setPrice(5.05);
        fruit.setImgSrc("Pumpkin.PNG");
        fruit.setRate("1");
        rate(fruit);
        fruit.setColor("FCA37F");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Garlic");
        fruit.setGroup("vegetable");
        fruit.setPrice(1.05);
        fruit.setImgSrc("Garlic.PNG");
        fruit.setRate("4");
        rate(fruit);
        fruit.setColor("E6E2D4");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Tomato");
        fruit.setGroup("vegetable");
        fruit.setPrice(2.65);
        fruit.setImgSrc("Tomato.PNG");
        fruit.setRate("5");
        rate(fruit);
        fruit.setColor("E81123");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Mushroom");
        fruit.setGroup("vegetable");
        fruit.setPrice(1.95);
        fruit.setImgSrc("Mushroom.PNG");
        fruit.setRate("2");
        rate(fruit);
        fruit.setColor("F8B9C2");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Corn");
        fruit.setGroup("vegetable");
        fruit.setPrice(0.55);
        fruit.setImgSrc("Corn.PNG");
        fruit.setRate("5");
        rate(fruit);
        fruit.setColor("E2E280");
        fruit.setVisible("1");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setName("Eggplant");
        fruit.setGroup("vegetable");
        fruit.setPrice(5.75);
        fruit.setImgSrc("Eggplant.PNG");
        fruit.setRate("3");
        rate(fruit);
        fruit.setColor("9C2988");
        fruit.setVisible("1");
        fruits.add(fruit);

        return fruits;
    }
    public void MyAccountButton(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private void setChosenFruitCard(Fruit fruit){
        fruitNameLabel.setText(fruit.getName());
        fruitGroupingLabel.setText(fruit.getGroup());
        fruitVisibleLabel.setText(fruit.getVisible());
        fruitPriceLabel.setText(OnlineShop.CURRENCY+fruit.getPrice());
        image2=new Image(Objects.requireNonNull(getClass().getResourceAsStream(fruit.getValue())));
        image=new Image(Objects.requireNonNull(getClass().getResourceAsStream(fruit.getImgSrc())));
        fruitImg.setImage(image);
        fruitValueLabel.setImage(image2);
        chosenFruitCard.setStyle("-fx-background-color: #"+fruit.getColor()+";\n" +
                "-fx-background-radius: 30;\n");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fruits.addAll(getData());
        VegetablesButton.setOnAction(this::VegetablesButton);    // method reference
//        MyAccountButton.setOnAction(this::MyAccountButton);    // method reference
        if (fruits.size()>0){
            setChosenFruitCard(fruits.get(0));
            myListener=new MyListener() {
                @Override
                public void onClickListener(Fruit fruit) throws URISyntaxException, IOException {
                    setChosenFruitCard(fruit);
                }

            };
        }
        int column=0;
        int row=1;
        try{
            for (int i=0; i<fruits.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setData(fruits.get(i), myListener);
                if (column==3){
                    column=0;
                    row++;
                }
                grid.add(anchorPane, column++, row);//(chils,column,row)

                //set item grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set item grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}