package day01;

import java.sql.*;

public class c3_JDBC {
    public static void main(String[] args) throws SQLException {

        String connectionUrl = "jdbc:oracle:thin:@ec2-54-159-174-62.compute-1.amazonaws.com:1521:xe";
        String username = "hr";
        String password = "hr";

        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        //Statement statement=con.createStatement();// to make the cursor free we have to pass the parameter in statement
        Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //TYPE_SCROLL_INSENSITIVE will make the cursor free
        //CONCUR_READ_ONLY will read only from the cursor
        ResultSet resultSet=statement.executeQuery("Select * from Employees");
        resultSet.next();
        resultSet.absolute(10);
        System.out.println("First_Name:"+resultSet.getString("first_name"));
        System.out.println("Last_Name:"+resultSet.getString("last_name"));
        System.out.println("E-mail:"+resultSet.getString("email"));

        resultSet.absolute(5);
        for(int i=1 ; i<=resultSet.getFetchSize(); i++){
            System.out.print(resultSet.getString(i)+" ");
        }
        System.out.println();
        resultSet.absolute(5);
        for(int i=1; i<=resultSet.getFetchSize(); i++){
            System.out.print(resultSet.getString(i)+" ");
        }
        System.out.println();
        resultSet.previous();
        System.out.println("****resultset previous example*****");
        System.out.println("first name: "+resultSet.getString("first_name"));
        System.out.println();

        resultSet.first();
        System.out.println("first_name :"+resultSet.getString("first_name"));

        resultSet.last();
        System.out.println("first_name :"+resultSet.getString("first_name"));
        //afterlast and beforefirst will not print anything

        if(resultSet.isAfterLast()==true){
            System.out.println("after last");
        }
        /*resultSet.beforeFirst();
        System.out.println("first_name :"+resultSet.getString("first_name"));*/


        if(resultSet.isBeforeFirst()==true){
            System.out.println("before first");
        }
        boolean isClosed= resultSet.isClosed();
        System.out.println(isClosed);

        resultSet.beforeFirst();
        boolean result=resultSet.isBeforeFirst();
        System.out.println(result);

        resultSet.isAfterLast();
        boolean afterLast=resultSet.isAfterLast();
        System.out.println(afterLast);




        resultSet.close();
        statement.close();
        con.close();



    }
}
