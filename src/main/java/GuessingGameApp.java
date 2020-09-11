import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number between 1 - 10:");
        int guess = input.nextInt();
        if (guess == 7){
            System.out.println("You win!");
        } else if (guess == 0){
            System.out.println("Please restart this game and only choose a number between 1 - 10");
        } else {
            System.out.println("You lose!");
        }
    }
}