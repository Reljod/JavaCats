import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Java Cats!");
        Cat cat = new Cat();
            
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type 'enter' or 'Y' to continue. 'N' to exit.");
            String answerStr = scanner.nextLine().toLowerCase();
            if (answerStr.equals("n")) {
                System.out.println("Thank you for using Java Cats! Goodbye!");
                return;
            }
            System.out.println("Do you want to see the Cat of the day? Type 'enter' or 'Y' if yes. 'N' to continue.");
            answerStr = scanner.nextLine().toLowerCase();
            if (answerStr.equals("y") || answerStr.equals("")) {
                System.out.println("The cat of the day says '" + cat.getWordOfTheDay() + "'");
                cat.getCatOfTheDay();
                System.out.println("Thank you for using Java Cats! Goodbye!");
                return;
            }

            
        }
    }
}


