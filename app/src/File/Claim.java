package File;

import java.util.Date;
import java.util.List;

public class Claim {
    private String id;
    private Date claimDate;
    private String insuredPerson;
    private String cardNumber;
    private Date examDate;
    private List<String> documents; // List of document names
    private double claimAmount;
    private String status;
    private String receiverBankName;
    private String receiverBankNumber;

    // Constructor, getters, and setters
}