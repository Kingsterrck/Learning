import java.util.Scanner;
public class August4 {
    public static void main(String[] args) {
        // String message = "Welcome to Java";
        // System.out.println(message.startsWith("We"));
        // System.out.println(message.startsWith("we"));
        // System.out.println(message.endsWith("va"));
        // System.out.println(message.endsWith("v"));
        // System.out.println(message.contains("to"));
        // System.out.println(message.contains("To"));

        guessNumber();
        
        
    }
    public static void guessNumber() {
        System.out.println("write integers from 0 to 100");
        Scanner input = new Scanner(System.in);
        int target = (int)(Math.random()*100);
        int guess = input.nextInt();
        int tries = 1;
        while (target != guess) {
            if (target < guess){ 
                System.out.println("your guess is too large");
            } else if (target > guess) {
                System.out.println("your guess is too small");
            }
            tries++;
            guess = input.nextInt();
        }
        System.out.println("you got it");
        System.out.println("You had " + tries + " tries");

        input.close();
    }
}
