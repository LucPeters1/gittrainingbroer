package com.example.demo.oop1.problem0;

import com.example.demo.problem1.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private final  String host;
    private final  String user;
    private final  String password;

    public Database(String host, String user, String password){
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public ResultSet executeQuery(String sql){
        try (Connection connection = DriverManager.getConnection(host, user, password)) {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return statement.executeQuery();

        } catch (SQLException e) {
            System.out.println("An error occurred while executing the SQL query");
            throw new RuntimeException();
        }
    }
    private List<com.example.demo.problem1.Book> procesData(ResultSet resultSet) throws SQLException {
        List<com.example.demo.problem1.Book> books = new ArrayList<>();


        while (resultSet.next()) {
            Book book = new Book(
                    resultSet.getString("id"),
                    resultSet.getString("title"));

            books.add(book);
        }
        return books;
    }
}


