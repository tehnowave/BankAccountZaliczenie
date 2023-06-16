import javax.swing.*;
import java.util.ArrayList;

// This is the main class that runs the application
public class Main {
    public static void main(String[] args) {
        // ArrayList to store all created bank accounts
        ArrayList<BankAccountNew> bankAccounts = new ArrayList<>();
        // An instance of BankAccountService to perform bank account operations
        BankAccountService bankAccountService = new BankAccountService();

        // Prompt user to create a new account
        String option = JOptionPane.showInputDialog(null, "Do you want to open account? type : 'Y' ");

        while (option != null) {
            // If user selects "Y", create a new account
            if (option.equalsIgnoreCase("Y")) {
                BankAccountNew newAccount = bankAccountService.createBankAccount();
                // If account creation was successful, add it to the list
                if (newAccount != null) {
                    bankAccounts.add(newAccount);
                    JOptionPane.showMessageDialog(null, "Account has been successfully created!");
                }
                // Prompt for next operation
                option = JOptionPane.showInputDialog(null, "Do you want to open new account? Y/N");
            }
            // If user selects "N", exit the loop
            else if (option.equalsIgnoreCase("N")) {
                break;
            }
            // If invalid option, prompt user again
            else {
                JOptionPane.showMessageDialog(null, "Invalid option, please try again");
                option = JOptionPane.showInputDialog(null, "Do you want to open account? type : 'Y' ");
            }
        }

        // Print all created bank accounts
        for (BankAccountNew account : bankAccounts) {
            System.out.println(account);
        }
    }
}
