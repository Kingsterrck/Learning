package DDCS;
import java.util.Scanner;

public class September18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // long a = 123456789L * 987654321L;
        // long b = 123456789 * 987654321;
        // System.out.println(a);
        // System.out.println(b);

        // double c = 4.35*100;
        // System.out.println(Math.round(c));

        // double d = 2.0-1.9;
        // System.out.println(d);

        // char a = '\'';
        // System.out.println(a);

        // int a=b=c=5;
        // k=l=j;
        // 5 = a;
        // a+b=c; 

        //System.out.println(7.0/3.0);

        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        input.close();
    }
}
