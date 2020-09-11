import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number between 1 - 10:");
        int guess = input.nextInt();
        if (guess == 7) {
            System.out.println("You win!");
        } else if (guess == 0) {
            System.out.println("Only choose a number between 1 - 10");
        } else {
            System.out.println("Incorrect, you have one more guess");
        }
        int guess2 = input.nextInt();
        if (guess2 == 7 || guess2 == 7) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.. Sorry Charlie");
        }
    }
}

