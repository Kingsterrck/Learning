package LearnAP.DDCS;
import java.util.Scanner;
public class Snail {
    public static void main(String[]args) {
        int num1 = 1, num2 = 1;
        Scanner input = new Scanner(System.in);
        int num_sum = 0;
        int n = input.nextInt();
        for (int i = 2; i < n; i++) {
            num_sum = num1 + num2;
            num1 = num2;
            num2 = num_sum;
        }
        System.out.println(num2);
        input.close();
    }
}