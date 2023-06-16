import javax.swing.*;
import java.util.HashSet;

// This class is responsible for handling bank account operations
public class BankAccountService {
    // HashSets to store unique IDs and account numbers
    private HashSet<String> uniqueIds = new HashSet<>();
    private HashSet<Integer> uniqueAccountNumbers = new HashSet<>();

    // Method to create a new bank account
    public BankAccountNew createBankAccount() {
        // Prompt user for name
        String name = JOptionPane.showInputDialog(null, "To open new Bank Account write the next information: Enter your name");
        // If user cancelled the operation, return null
        if (name == null) return null;

        // Prompt user for last name
        String lastname = JOptionPane.showInputDialog(null, "Enter your lastname");
        // If user cancelled the operation, return null
        if (lastname == null) return null;

        // Generate a unique ID
        String uniqueId;
        do {
            uniqueId = RandomGenerator.generateRandomId();
        } while (!uniqueIds.add(uniqueId)); // Ensure the ID is unique

        // Prompt user for currency
        String currency = "";
        do {
            currency = JOptionPane.showInputDialog(null, "Which currency of your account (PLN or USD)?");
            // If user cancelled the operation, return null
            if (currency == null) return null;
        } while (!currency.equalsIgnoreCase("PLN") && !currency.equalsIgnoreCase("USD")); // Ensure the currency is valid

        // Generate a unique account number
        int uniqueAccountNumber;
        do {
            uniqueAccountNumber = RandomGenerator.generateAccountNumber();
        } while (!uniqueAccountNumbers.add(uniqueAccountNumber)); // Ensure the account number is unique

        // Return the new BankAccount object
        return new BankAccountNew(name, lastname, uniqueId, currency, uniqueAccountNumber);
    }
}
