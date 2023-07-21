package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class CustomerController {

    final String DB_HOST = "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1";
    final String DB_USER = "createment";
    final String DB_PASS = "createment";

    // Route for HTTP GET request to "/customer"
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView showForm() {
        // Creates a ModelAndView object for "customerHome" view with a new Customer object
        return new ModelAndView("customerHome", "customer", new Customer());
    }

    // Route for HTTP POST request to "/register"
    @PostMapping("/register")
    public ModelAndView registerCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {

        // SQL query to insert a new record into the "customers" table
        final String sql = "INSERT INTO customers(name, lastname, email, address,phone_number) VALUES (?,?,?,?,?)";
        ModelAndView modelAndView = new ModelAndView();

        // Try-with-resources block for database connection and preparing SQL statement
        try (Connection conn = DriverManager.getConnection(DB_HOST, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            // Set the values of placeholders in SQL statement
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getPhone_number());

            // Execute the SQL statement
            preparedStatement.executeUpdate();

            // Print success message to console
            System.out.println("Data entered successfully");

        } catch (SQLException e) {
            // Print any SQL exceptions to the console
            e.printStackTrace();
        }

        // Add the Customer object to ModelAndView object
        modelAndView.addObject("customer", customer);

        // Set the view name to "success"
        modelAndView.setViewName("success");

        // Return the ModelAndView object
        return modelAndView;
    }
    static 
}
