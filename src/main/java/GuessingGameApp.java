import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a whole number between 1 - 10:");
        int guess = input.nextInt();
        int randomNumber = (int) (Math.random() * 10);
        if (guess == randomNumber) {
            System.out.println("You win!");
        } else if (guess == -1){
            System.exit(0);
        } else if (guess == 0) {
            System.out.println("Only choose a number between 1 - 10");
        } else if (guess < randomNumber){
            System.out.println("The correct number is higher! You have one more guess.");
        } else if (guess > randomNumber){
            System.out.println("The correct number is lower! You have one more guess.");
        } else {
            System.out.println("Incorrect, you have one more guess");
        }
        int guess2 = input.nextInt();
        if (guess2 == randomNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.. Sorry Charlie");
        }
    }
}

