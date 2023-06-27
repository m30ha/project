package pack.project;

import javafx.scene.chart.PieChart;

import java.sql.SQLException;
import java.util.ArrayList;

public class Users {
    private int id = -1;// dakhele database nist
    private String username,password,email;
    //setter getter
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //method
    public static ArrayList<Users> getAllUsers() throws SQLException {
        return DataBase.getAllUsers();
    }

    public void save(){
        if(this.id == -1){
            try {
                id = DataBase.creatUser(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else{
            try {
                DataBase.updateUsers(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //constructor
    public Users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password,String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
