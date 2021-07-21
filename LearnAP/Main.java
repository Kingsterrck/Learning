import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pyramid2 = input.next();
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(pyramid2);
        System.out.print(" ");
        System.out.println(" ");
        System.out.print(" ");
        System.out.print(pyramid2);
        System.out.print(pyramid2);
        System.out.print(pyramid2);
        System.out.println(" ");
        for (int i=1;i<6;i++) {
            System.out.print(pyramid2);
        }
        System.out.println();
        System.out.print(" ");
        System.out.print(pyramid2);
        System.out.print(pyramid2);
        System.out.print(pyramid2);
        System.out.println(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(pyramid2);
        System.out.print(" ");
        System.out.println(" ");
        input.close();
    }
}
