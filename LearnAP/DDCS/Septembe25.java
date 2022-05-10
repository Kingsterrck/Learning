package LearnAP.DDCS;
import java.util.Scanner;
public class Septembe25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 90) {
            System.out.println("you got A*");
        } else if (a >= 80) {
            System.out.println("you got A");
        }else if (a >= 70) {
            System.out.println("you got B");
        }else if (a >= 60) {
            System.out.println("you got C");
        } else {
            System.out.println("you got D");
        }
        input.close();
    }
}
