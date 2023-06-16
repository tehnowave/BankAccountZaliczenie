import java.util.Random;

public class RandomGenerator {

    // Generates a random ID of 4 characters
    public static String generateRandomId() {
        int length = 4;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        // Appends a random character from the list to the StringBuilder
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    // Generates a random 9-digit bank account number
    static int generateAccountNumber() {
        Random rand = new Random();
        // Generates a number from 100000000 (inclusive) to 1000000000 (exclusive)
        return rand.nextInt(900000000) + 100000000;
    }
}
