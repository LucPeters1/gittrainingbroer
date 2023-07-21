package com.example.demo.oop1.problem0;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShop {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        Book[] books = bookShop.getBooks();


    }

    private Book[] loadBooks() {
        //Authentication
        final String DB_HOST = "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1";
        final String DB_USER = "createment";
        final String DB_PASS = "createment";
        final String sql = "SELECT * FROM books";

        List<Book> bookList = new ArrayList<>();


        //
        try (
                Connection conn = DriverManager.getConnection(DB_HOST, DB_USER, DB_PASS);
                Statement preparedStatement = conn.createStatement();
                ResultSet resultSet = preparedStatement.executeQuery(sql)) {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("title");
                String author_id = resultSet.getString("author_id");
                String isbn = resultSet.getString("isbn");
                String price = resultSet.getString("price");

                Book book = new Book();
                book.setTitle(title);
                book.setAuthor_id(author_id);
                book.setISBN(isbn);
                book.setPrice(price);

                bookList.add(book);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return bookList.toArray(new Book[0]);
    }

    public Book[] getBooks() {
        return loadBooks();
    }

}
