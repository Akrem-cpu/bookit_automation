package com.test;

import org.junit.Test;

import java.sql.*;


public class a {
    @Test
    public void test() throws SQLException {
        String url = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com/room_reservation_qa?/5432/shopme";
        String username = "qa_user";
        String password ="Cybertek11!";



            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("select * from pg_am");

        resultSet.next();
        System.out.println("resultSet.getString(1) = " + resultSet.getString(1));


    }


}
