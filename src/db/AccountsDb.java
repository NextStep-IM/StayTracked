package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import customExceptions.InvalidInputException;
import model.Account;

public class AccountsDb {

    //method to validate Input
    public static void validateUser(String email, String password) throws InvalidInputException {
        try (Connection c = DBConnectionManager.getConnection()) {
            if (c == null) {
                throw new InvalidInputException("Database connection failed!");
            }

            String query = "SELECT password FROM accounts WHERE email = ?";
            try (PreparedStatement ps = c.prepareStatement(query)) {
                ps.setString(1, email);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String passDb = rs.getString("password");
                        if (!passDb.equals(password)) {
                            throw new InvalidInputException("Incorrect email or password!");
                        }
                    } else {
                        throw new InvalidInputException("Email not found!");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //method to add a new account in database
    public static void addAccount(Account account) {
        try(Connection c = DBConnectionManager.getConnection()) {
            if (c == null) {
                String error = "Database connection failed!";
            }
            
            //add a logic to insert Account Details in database

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
