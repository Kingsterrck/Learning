package LearnAP.DDCS;
import java.util.Scanner;
public class September23 {
    public static void main(String[] args) {
        // int a = 1;
        // int b = a<3?2:3;
        // System.out.println(b);
        // String note1 = "range of byte lasts from -128 to 127";
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.println("it is even");
        }
        if (a % 2 == 1){
            System.out.println("it is odd");
        }
        input.close();
    }
}