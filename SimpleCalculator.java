import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 1 theke 100 er modhye ekta random number generate kora
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println("--- Number Guessing Game ---");
        System.out.println("Computer 1 theke 100 er modhye ekta number select koreche. Guess kora shuru koro!");
        
        // Sothik number naashwa porjonto loop cholbe
        while (guess != targetNumber) {
            System.out.print("Tomar guess kora number-ti likho: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Aro boro number dao! (Too low)");
            } else if (guess > targetNumber) {
                System.out.println("Aro choto number dao! (Too high)");
            } else {
                System.out.println("Obhinandan! Tumi sothik number-ti guess korecho.");
                System.out.println("Sothik number-ti chilo: " + targetNumber);
                System.out.println("Tomar total attempt legeche: " + attempts + " ti.");
            }
        }
        
        scanner.close();
    }
}