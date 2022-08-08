package day01;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.sql.*;

public class c2_JDBC {
/*
    public static void main(String[] args) throws SQLException {

        String connectionUrl = "jdbc:oracle:thin:@ec2-54-159-174-62.compute-1.amazonaws.com:1521:xe";
        String username = "hr";
        String password = "hr";

        Connection connection= DriverManager.getConnection(connectionUrl,username,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from employees");
        resultSet.next();
        System.out.println("Employee Name:"+resultSet.getString("first_name"));

        while(resultSet.next()){
            System.out.println("Employee Name:"+resultSet.getString("first_name"));
            System.out.println("Employee  Last Name:"+resultSet.getString("last_name"));
        }

        ResultSet resultSet1= statement.executeQuery("Select * from countries ");

        resultSet1.next();
        while(resultSet1.next()){
            System.out.println("Country Id: "+ resultSet1.getString("country_id"));
            System.out.println("Country Name: "+ resultSet1.getString("Country_name"));
        }

        resultSet1.close();
        resultSet.close();
        statement.close();;
        connection.close();;










    }
*/
}
