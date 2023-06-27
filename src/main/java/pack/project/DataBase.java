package pack.project;
import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    static final String DbURL = "jdbc:mysql://localhost:3306/shop";
    static final String USER = "root";
    static final String PASS = "amir123456";
    private static Connection connection = null;
    private static Statement statement = null;

    private DataBase(){}

    public static void makeConnection(){
        try {
            connection = DriverManager.getConnection(DbURL,USER,PASS);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static int creatUser(Users users) throws SQLException {
        makeConnection();
        statement.execute(String.format("insert into users (username,password,Email) VALUES " +
                "('%s', '%s','%s')",users.getUsername(),users.getPassword(),users.getEmail()), statement.RETURN_GENERATED_KEYS);

        ResultSet re = statement.getGeneratedKeys();
        re.next();
        int id = re.getInt(1);
        closeConnection();
        return id;
    }

    public static int creatAdmin(Admins admins) throws SQLException {
        makeConnection();
        statement.execute(String.format("insert into admins (username,password,Email) VALUES ('%s', '%s','%s')",
                admins.getUsername(),admins.getPassword(),admins.getEmail()), statement.RETURN_GENERATED_KEYS);

        ResultSet re = statement.getGeneratedKeys();
        re.next();
        int id = re.getInt(1);
        closeConnection();
        return id;
    }

    public static int creatSeller(Sellers sellers) throws SQLException {
        makeConnection();
        statement.execute(String.format("insert into sellers (username,password,Email,company) VALUES" +
                        " ('%s', '%s', '%s','%s')",
                sellers.getUsername(),sellers.getPassword(),sellers.getEmail(),sellers.getCompany()), statement.RETURN_GENERATED_KEYS);

        ResultSet re = statement.getGeneratedKeys();
        re.next();
        int id = re.getInt(1);
        closeConnection();
        return id;
    }

    public static void deleteUser(Users users) throws SQLException {
        makeConnection();
        statement.execute(String.format("delete from users where id = %d",users.getId()));
        closeConnection();

    }

    public static void deleteAdmin(Admins admins) throws SQLException {
        makeConnection();
        statement.execute(String.format("delete from admins where id = %d",admins.getId()));
        closeConnection();

    }

    public static void deleteSellers(Sellers sellers) throws SQLException {
        makeConnection();
        statement.execute(String.format("delete from sellers where id = %d",sellers.getId()));
        closeConnection();

    }

    public static ArrayList<Users> getAllUsers() throws SQLException {
        makeConnection();
        ResultSet re = statement.executeQuery("select * from users");
        ArrayList<Users> users = new ArrayList<>();

        while (re.next()){
            users.add(new Users(re.getInt("id"),
                    re.getString("username"), re.getString("password")));

        }
        closeConnection();
        return users;
    }

    public static ArrayList<Admins> getAllAdmins() throws SQLException {
        makeConnection();
        ResultSet re = statement.executeQuery("select * from admins");
        ArrayList<Admins> admins = new ArrayList<>();

        while (re.next()){
            admins.add(new Admins(re.getInt("id"),
                    re.getString("username"), re.getString("password")));

        }
        closeConnection();
        return admins;
    }

    public static ArrayList<Sellers> getAllSellers() throws SQLException {
        makeConnection();
        ResultSet re = statement.executeQuery("select * from sellers");
        ArrayList<Sellers> sellers = new ArrayList<>();

        while (re.next()){
            sellers.add(new Sellers(re.getInt("id"),
                    re.getString("username"), re.getString("password")));

        }
        closeConnection();
        return sellers;
    }

    public static boolean checkAdmins(String user, String pass) throws SQLException {
        makeConnection();
        boolean sw = false;

        ResultSet re = statement.executeQuery("select * from admins");
        while (re.next()){
            if((user.equalsIgnoreCase(re.getString("username"))) &&
                    pass.equalsIgnoreCase(re.getString("password"))){
                sw = true;
                break;
            }
        }
        if(sw){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkSellers(String user, String pass) throws SQLException {
        makeConnection();
        boolean sw = false;

        ResultSet re = statement.executeQuery("select * from sellers");
        while (re.next()){
            if((user.equalsIgnoreCase(re.getString("username"))) &&
                    pass.equalsIgnoreCase(re.getString("password"))){
                sw = true;
                break;
            }
        }
        if(sw){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkUsers(String user, String pass) throws SQLException {
        makeConnection();
        boolean sw = false;

        ResultSet re = statement.executeQuery("select * from users");
        while (re.next()){
            if((user.equalsIgnoreCase(re.getString("username"))) &&
                    pass.equalsIgnoreCase(re.getString("password"))){
                sw = true;
                break;
            }
        }
        if(sw){
            return true;
        }
        else {
            return false;
        }
    }

    public static void updateUsers(Users users) throws SQLException {
        makeConnection();
        statement.execute(String.format("update users set username = '%s', password = '%s'" +
                " where id = %d",users.getUsername(),users.getPassword()),users.getId());
        closeConnection();

    }

    public static void updateAdmins(Admins admins) throws SQLException {
        makeConnection();
        statement.execute(String.format("update admins set username = '%s', password = '%s'" +
                " where id = %d",admins.getUsername(),admins.getPassword()),admins.getId());
        closeConnection();

    }

    public static void updateSellers(Sellers sellers) throws SQLException {
        makeConnection();
        statement.execute(String.format("update sellers set username = '%s', password = '%s'" +
                " where id = %d",sellers.getUsername(),sellers.getPassword()),sellers.getId());
        closeConnection();

    }




    public static void main(String[] args){


    }

}
