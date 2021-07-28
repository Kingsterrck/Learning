import java.util.Scanner;

public class July28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(getMax(4.4,5.0));
        grade(85);

        int a = (int)'1';
        System.out.println(a);

        char b = (char)49;
        System.out.println(b);

        String message = input.next();
        System.out.println("Length: " + message.length());
        System.out.println(message.charAt(1));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());


        String message2 = "Welcome to Java";
        System.out.println(message2);
        String message3 = message2.substring(0, 11) + "HTML";
        System.out.println(message3);
        String message4 = message2.substring(11);
        System.out.println(message4 + " and HTML");

        System.out.println(message2.indexOf("W"));
        System.out.println(message2.indexOf("a",2));
        System.out.println(message2.lastIndexOf("a"));
        System.out.println(message2.lastIndexOf("a", 5));

        input.close();
    }
    public static double getMax(double a, double b) {
        double result = 0;
        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }
    public static void grade(double score) {
        if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}
