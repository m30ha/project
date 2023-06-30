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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import pack.project.model.Fruit;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.*;
import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import pack.project.ItemController;
import pack.project.MyListener;





public class Controller{

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
    private Stage stage;
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
            if ((!DataBase.checkSellers(userSeller.getText(), passSeller.getText()) && userSeller.getText() != null && passSeller.getText() != null)) {
                int s = DataBase.creatSeller(new Sellers(userSeller.getText(), passSeller.getText(),
                        emailSeller.getText(), txtCompany.getText()));

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
            if ((!DataBase.checkUsers(userBuyer.getText(), passBuyer.getText())) && userBuyer.getText() != null && passBuyer.getText() != null) {
                int d = DataBase.creatUser(new Users(userBuyer.getText(), passBuyer.getText(), emailBuyer.getText()));

                Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
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
