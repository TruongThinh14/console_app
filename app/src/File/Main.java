package File;

import File.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Sample data initialization
        List<Customer> customers = new ArrayList<>();
        List<Claim> claims = new ArrayList<>();

        // Populate sample customers, insurance cards, and claims
        Customer policyHolder = new PolicyHolder();
        policyHolder.setId("c1234567");
        policyHolder.setFullName("John Doe");
        // Initialize and set insurance card
        // Add claims to the policy holder

        Dependent dependent = new Dependent();
        dependent.setId("c7654321");
        dependent.setFullName("Jane Doe");
        // Initialize and set insurance card
        // Add claims to the dependent

        // Add dependents to the policyholder
        ((PolicyHolder) policyHolder).addDependent(dependent);

        // Initialize ClaimManager with initial claims

        // Sample UI interaction
        System.out.println("Welcome to the Insurance Claims Management System!");



    }
}