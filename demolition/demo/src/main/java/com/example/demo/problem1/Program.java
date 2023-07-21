package com.example.demo.problem1;

import com.example.demo.oop1.problem0.Database;
import com.example.demo.oop1.problem0.Book;


import java.util.List;

public class Program {

     final static String DB_HOST = "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1";
     final  static String DB_USER = "createment";
     final  static String DB_PASS = "createment";

    public static void main(String[] args) {



        Database booksDatabase = new Database(DB_HOST, DB_USER, DB_PASS);
        oop2.example.problem0.BookShop Shop = new oop2.example.problem0.BookShop(booksDatabase);

        List<Book> books = Shop.loadBooks();
        printResult(books);
    }

    private static void printResult(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}