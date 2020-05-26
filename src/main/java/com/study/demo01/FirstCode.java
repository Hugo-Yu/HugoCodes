package com.study.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FirstCode  {
    public static void main(String[] args) throws  Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/eesy","root","");
        PreparedStatement pstm = conn.prepareStatement("select * from student");
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("name"));
            rs.close();
            pstm.close();
            conn.close();
        }


    }
}
