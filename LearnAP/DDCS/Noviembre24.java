package LearnAP.DDCS;
import java.util.Scanner;

public class Noviembre24 {
    public static void main(String[] args) {
        // for (int i = 1; i < 10; i++) {
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(k + " * " + i + " = " + k*i + "  ");
        //     }
        //     System.out.println("");
        // }

        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = row- 1-i;j>0;j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < 2*i+1;k++) {
                System.out.print(" ");
                if (k == i-1) {
                    System.out.print("*");
                }
            }
            for (int j = row- 1-i;j>0;j--) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
