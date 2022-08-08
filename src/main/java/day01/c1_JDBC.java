package day01;

import java.sql.*;

public class c1_JDBC {

/*
    public static void main(String[] args) throws SQLException {

        //  String IPAddress="ec2-54-159-174-62.compute-1.amazonaws.com"
        // this url but we have to format it  as our connection URL
        // lets create a connection variable
        String connectionUrl = "jdbc:oracle:thin:@ec2-54-159-174-62.compute-1.amazonaws.com:1521:xe";
        String username = "hr";
        String password = "hr";
        //create connection
        Connection connection = DriverManager.getConnection(connectionUrl, username, password);
        //create statement
        Statement statement = connection.createStatement();
        //execute query and store the result in resultSet
        ResultSet resultSet = statement.executeQuery("Select * from employees");
        // by default the cursor is always at the top
        resultSet.next(); // this will move the cursor to next
        System.out.println("First column value: " + resultSet.getString(1));// you have to pass the column index in the parameter
        System.out.println(" First column value: "+ resultSet.getString("First_Name"));
        resultSet.next();
        System.out.println("First column value: "+ resultSet.getString(1));
        System.out.println("First column value: "+ resultSet.getString(2));
       resultSet.close();;
       statement.close();
       connection.close();


    }
*/
}


