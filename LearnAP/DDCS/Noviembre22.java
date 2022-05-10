package LearnAP.DDCS;
import java.util.Scanner;

public class Noviembre22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // int a = 1;
        // int b = 1;
        // for (int i = 3; i <= num;i++) {
        //     if (a < b){
        //         a = a + b;
        //     } else {
        //         b = a + b;
        //     }
        // }
        // if (a > b){
        //     System.out.println(a);
        // } else {
        //     System.out.println(b);
        // }
        int total = 0;
        for (int k = 0; k <= 101; k+=2) {
            total += k + 1;
        }
        System.out.println(total);
        input.close();
    }
}
