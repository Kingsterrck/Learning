package LearnAP.DDCS;
import java.util.Scanner;

public class November9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // int num1 = 1;
        // int num2 = 1;
        int carry = 0;

        for (int i=2;i<11;i+=2) {
            carry+=i;
        }
        System.out.println(carry);
    }
}
