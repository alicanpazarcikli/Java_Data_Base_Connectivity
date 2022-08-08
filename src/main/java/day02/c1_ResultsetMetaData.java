package day02;

import Utils.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class c1_ResultsetMetaData {

    public static void main(String[] args) throws SQLException {
        DatabaseUtil.createConnection();
        ResultSet resultSet=DatabaseUtil.runQuery("Select * from Employees");
        resultSet.next();
        System.out.println("First Employee Name :"+resultSet.getString("first_name"));
// get the information of resultset using getMetaData
        ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
        resultSetMetaData.getColumnCount();
        // getting column count
        int columnCount= resultSetMetaData.getColumnCount();
        System.out.println("Number of Columns:"+columnCount);
        // getting any specific column name
        resultSetMetaData.getColumnName(3);
        String thirdColumnName=resultSetMetaData.getColumnName(3);
        System.out.println("Third Column Name:"+thirdColumnName);

        // let's get  all column names.
        for(int i=1; i<= resultSetMetaData.getColumnCount(); i++){
            System.out.print(resultSetMetaData.getColumnName(i)+"\t");
        }

        System.out.println("*************************");

        System.out.println(resultSetMetaData.getColumnName(3));

        List<String> columnNames=new ArrayList<>();
        for(int i=1 ; i<columnCount; i++){
          columnNames.add(resultSetMetaData.getColumnName(i));

        }
        System.out.println(columnNames);
        System.out.println(DatabaseUtil.getTotalColumnCount());
        DatabaseUtil.getAllData();
        DatabaseUtil.closeDataBase();






    }
}
