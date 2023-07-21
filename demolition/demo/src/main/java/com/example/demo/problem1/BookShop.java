package oop2.example.problem0;

import com.example.demo.oop1.problem0.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private final Database db;

    public BookShop(Database db) {
        this.db = db;
    }

    public List<Book> loadBooks() {
        return db.executeQuery("SELECT * FROM books");
    }


}