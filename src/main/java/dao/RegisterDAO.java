package dao;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
    private String dburl = "jdbc:h2:~/test";
    private String dbname = "root";
    private String dbpassword = "";
    private String driver = "org.h2.Driver";

    public void connection(String driver){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection con=null;
        try {
            con = DriverManager.getConnection(dburl, dbname, dbpassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  con;
    }


    public String insert(User user){
        connection(driver);
        Connection con = getConnection();
        String result = "Data entered sucessfuly";
        String sql = "insert into user values(?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
             preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = "Data not entered";
        }

        return result;
    }
}
