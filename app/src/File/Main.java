package File;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Login functionality
        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.println("Login:");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            // Implement user authentication logic
            // Replace with your actual authentication logic
            isLoggedIn = authenticateUser(username, password);

            if (!isLoggedIn) {
                System.out.println("Invalid username or password. Please try again.\n");
            }
        }



        // Sample data initialization
        List<Customer> customers = new ArrayList<>();
        List<Claim> claims = new ArrayList<>();

        // Populate sample customers, insurance cards, and claims
        Customer policyHolder = new PolicyHolder();
        policyHolder.setId("s3914412");
        policyHolder.setFullName("ThinhNguyen");
        // Initialize and set insurance card
        // Add claims to the policyholder

        Dependent dependent = new Dependent();
        dependent.setId("s3914412");
        dependent.setFullName("ThinhNguyen");

        // Sample UI interaction
        System.out.println("Welcome to the Insurance Claims Management System!");

    }

    private static boolean authenticateUser(String s3914412, String abc123) {
        String username = s3914412;
        String password = abc123;
        return username.equals("s3914412") && password.equals("abc123");
    }
}