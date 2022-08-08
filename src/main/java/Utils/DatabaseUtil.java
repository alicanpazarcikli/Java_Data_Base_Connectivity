package Utils;

import java.sql.*;

public class DatabaseUtil {

    private static Connection con;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection() throws SQLException {
        String connectionUrl=ConfigurationReader.getProperty("database.url");
        String userName=ConfigurationReader.getProperty("database.username");
        String password=ConfigurationReader.getProperty("database.password");


        try {
            con = DriverManager.getConnection(connectionUrl, userName, password);
            System.out.println("Connection created successfully");
        }catch (SQLException throwables){
            System.out.println("Connection failed....!");
        }
    }


    public static ResultSet runQuery(String query){
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(query);
        }catch (SQLException throwables){
            System.out.println("An error occurred  while executeQuery");
        }
        return resultSet;
    }
    public static void closeDataBase() throws SQLException {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (con != null) {
                con.close();
            }
        }catch (SQLException throwables){
            System.out.println("An error occurred while closing connection");
        }

    }
    public static int getTotalColumnCount() throws SQLException {
        int columnCount=0;
        try {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columnCount = resultSetMetaData.getColumnCount();

        }catch (SQLException throwables){
            System.out.println("An error occurred while counting columns");
        }
        return columnCount;
    }
    public static void getAllData() throws SQLException {
        int columnCount=getTotalColumnCount();
        while(resultSet.next()){
            for(int i=1; i<=columnCount; i++){
                System.out.print(resultSet.getString(i)+"\t");
            }
            System.out.println();
        }
    }

}
