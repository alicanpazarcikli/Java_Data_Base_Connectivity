package day03;

import Utils.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class c1_JDBC {
    public static void main(String[] args) throws SQLException {
        DatabaseUtil.createConnection();
        DatabaseUtil.runQuery("Select * from employees where job_id='IT_PROG' ");
        ResultSet rs=DatabaseUtil.runQuery("Select * from employees where job_id='IT_PROG'");
        while(rs.next()){
            System.out.print(rs.getString("first_name")+"\t");
            System.out.print(rs.getString("email")+"\t");
            System.out.print(rs.getDate("hire_date")+"\t");
            System.out.print(rs.getString("job_id")+"\t");
            System.out.println("********************************************************");
        }
        DatabaseUtil.closeDataBase();








    }
}
