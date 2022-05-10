package LearnAP;
import java.util.Scanner;

public class July11 {
    public static void main(String[] args) {
        // double radius;
        // double area;
        // radius = 20;
        // area = radius * radius * 3.14159;
        // System.out.println("The area for the circle with radius " + radius + " is " + area);
        
        // Scanner input = new Scanner(System.in);
        // double radius = input.nextDouble();
        // double area = radius * radius * 3.14159;
        // System.out.println("The area for the circle with radius " + radius + " is " + area);

        // Scanner input = new Scanner(System.in);
        // double number1 = input.nextDouble();
        // double number2 = input.nextDouble();
        // double number3 = input.nextDouble();
        // double average = (number1 + number2 + number3) / 3;
        // System.out.println("The average is " + average);

        // double x = 1.5;
        // int y = 5* (3/2);
        // System.out.println(3/2.0);

        // final double pi = 3.1415926;
        // Scanner input = new Scanner(System.in);
        // double radius = input.nextDouble();
        // double area = radius * radius * pi;
        // System.out.println("The area for the circle with radius " + radius + " is " + area);

        // double miles = 100;
        // final double KILOMETERS_PER_MILE = 1.609;
        // double kilometers = miles *KILOMETERS_PER_MILE;
        // System.out.println(kilometers);

        // Scanner input = new Scanner(System.in);
        // int second = input.nextInt();
        // int minute = second / 60;
        // int remained = second % 60;
        // System.out.println(minute + " minutes and " + remained + " seconds");
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int week = n % 7;
        System.out.println(week+2);
        input.close();
    }
}