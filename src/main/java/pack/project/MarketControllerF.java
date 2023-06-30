package pack.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//import model.Fruit;
import pack.project.DataBase;
import pack.project.OnlineShop;
import pack.project.Sellers;
import pack.project.Users;
import pack.project.model.Fruit;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

public class    MarketControllerF implements Initializable {
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

        return fruits;
    }
    public void MyAccountButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void VegetablesButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filterV.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void FruitButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homepage.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void HighQualityButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filterH.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void BestSellingButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filterT.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void EfficientButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filterE.fxml")));
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
//        VegetablesButton.setOnAction(this::VegetablesButton);    // method reference
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
                itemController.setData(fruits.get(i),  myListener);
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






    public ImageView imglogo;
    public ImageView matlogo;
    public PasswordField txtpassword;
    public TextField user;
    public Label accestxt;
    public Label welcometxt;
    public Button loginbutton;
    public Button facebookbutton;
    public Button gmailbutton;
    public ImageView logouser;
    public ImageView locklogo;
    public ImageView accountlogo;
    public ImageView flogo;
    public ImageView glogo;
    public ImageView logoimage;
    public ImageView circleimage;
    public Button buyerbutton;
    public Button sellerbutton;
    public Button logoutbutton;
    //  private Stage stage;
    private Scene scene;
    @FXML
    private PasswordField txtPassSeller;
    @FXML
    private TextField txtEmailSeller;

    @FXML
    private TextField emailSeller;
    @FXML
    private TextField emailBuyer;
    @FXML
    private PasswordField passSeller;

    @FXML
    private TextField userSeller;
    @FXML
    private PasswordField passBuyer;

    @FXML
    private TextField userBuyer;
    @FXML
    private TextField txtUserSeller;
    @FXML
    private TextField txtCompany;
    @FXML
    private TextField txtEmailBuyer;
    @FXML
    private PasswordField txtPassBuyer;
    @FXML
    private TextField txtUserBuyer;
    @FXML
    private Button btnCreateAccBuyer;
    @FXML
    private CheckBox btnCheckBox;
    @FXML
    private CheckBox btnCheckBox2;
    @FXML
    private Button btnCreateAccSeller;
/*
        @FXML
        private Button BestSellingButton;

        @FXML
        private Button DairyButton;

        @FXML
        private Button EfficientButton;

        @FXML
        private Button FruitButton;

        @FXML
        private Button HighQualityButton;

        @FXML
        private Button MyAccountButton;

        @FXML
        private Button VegetablesButton;

        @FXML
        private VBox chosenFruitCard;

        @FXML
        private Label fruitGroupingLabel;

        @FXML
        private ImageView fruitImg;

        @FXML
        private Label fruitNameLabel;

        @FXML
        private Label fruitPriceLabel;

        @FXML
        private ImageView fruitValueLabel;

        @FXML
        private Label fruitVisibleLabel;

        @FXML
        private GridPane grid;

        @FXML
        private ScrollPane scroll;

 */

    public void loginpage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseInSignup(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("choose-signup.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void buyer(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signup-buyer.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void seller(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signup-seller.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void site(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("site.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML//check conditions to login
    void LoginPress(ActionEvent event) throws IOException, SQLException {
        if(user.getText() == "" && txtpassword.getText() == ""){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Please enter your username and password!!!");
            alert.setHeaderText("There was a problem!!!");
            alert.showAndWait();
        }
        else {
            // test for admins screen (admins panel)
            if (DataBase.checkAdmins(user.getText(), txtpassword.getText())) {
                Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            //test for users screen(home page)
            else if (DataBase.checkUsers(user.getText(), txtpassword.getText())) {
                Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } else if (DataBase.checkSellers(user.getText(), txtpassword.getText())) {
                Parent root = FXMLLoader.load(getClass().getResource("test3.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setContentText("Your Username or Password is wrong!!!");
                alert.setHeaderText("There was a problem!!!");
                alert.showAndWait();
            }
        }
    }

    @FXML//come back to login page
    void TestLogin(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML//add seller
    void CreateAccSeller(ActionEvent event) throws SQLException, IOException {
        if (userSeller.getText() == "" && passSeller.getText() == "" && emailSeller.getText() == "") {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Please enter your username and password!!!");
            alert.setHeaderText("There was a problem!!!");
            alert.showAndWait();
        } else {
            if ((!DataBase.checkSellers(txtUserSeller.getText(), txtPassSeller.getText()) && txtUserSeller.getText() != null && txtPassSeller.getText() != null)) {
                int s = DataBase.creatSeller(new Sellers(txtUserSeller.getText(), txtPassSeller.getText(),
                        txtEmailSeller.getText(), txtCompany.getText()));

                System.out.println(s);

                Parent root = FXMLLoader.load(getClass().getResource("test3.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setContentText("There is account in site with this values");
                alert.setHeaderText("There was a problem!!!");
                alert.showAndWait();
            }
        }
    }

    @FXML//add user(buyer)
    void CreateAccUser(ActionEvent event) throws SQLException, IOException {
        if (userBuyer.getText() == "" && passBuyer.getText() == "" && emailBuyer.getText() == "") {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Please enter your username and password!!!");
            alert.setHeaderText("There was a problem!!!");
            alert.showAndWait();
        } else {
            if ((!DataBase.checkUsers(txtUserBuyer.getText(), txtPassBuyer.getText())) && txtUserBuyer.getText() != null && txtPassBuyer.getText() != null) {
                int d = DataBase.creatUser(new Users(txtUserBuyer.getText(), txtPassBuyer.getText(), txtEmailBuyer.getText()));

                System.out.println(d);

                Parent root = FXMLLoader.load(getClass().getResource("test2.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setContentText("There is a account in the site with this values");
                alert.setHeaderText("There was a problem!!!");
                alert.showAndWait();

            }

        }
    }

    public void facebook(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
    }

    public void gmail(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://mail.google.com/"));
    }





}