public class BankAccountNew {
    // The name of the account holder
    private String name;

    // The lastname of the account holder
    private String lastName;

    // The id of the account
    private String id;

    // Bank account number
    private int bankAccountNumber;

    // Currency of the account (PLN or USD)
    private String currency;

    // Getter for currency
    public String getCurrency() {
        return currency;
    }

    // Setter for currency. Accepts only "PLN" or "USD", case insensitive.
    public void setCurrency(String currency) {
        if (currency.equalsIgnoreCase("PLN") || currency.equalsIgnoreCase("USD")) {
            this.currency = currency;
        } else {
            System.out.println("Wrong currency, please try again");
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for bank account number
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    // Setter for bank account number
    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // Constructor for creating new bank account object
    public BankAccountNew(String name, String lastName,String id, String currency,int bankAccountNumber) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.bankAccountNumber = bankAccountNumber;
        this.currency = currency;
    }

    // toString method for representing bank account object as a string
    @Override
    public String toString() {
        return "BankAccountNew{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                ", currency='" + currency + '\'' +
                '}';
    }
}
