package pack.project;

import java.sql.SQLException;
import java.util.ArrayList;

public class Sellers {
    private int id = -1;// dakhele database nist
    private String username,password,email,company;

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //setter getter
    public int getId() {
        return id;
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
    public static ArrayList<Sellers> getAllSellers() throws SQLException {
        return DataBase.getAllSellers();
    }

    public void save(){
        if(this.id == -1){
            try {
                id = DataBase.creatSeller(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else{
            try {
                DataBase.updateSellers(this);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //constructor
    public Sellers(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Sellers(String username, String password, String email, String company) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.company = company;
    }
}
