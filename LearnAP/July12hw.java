import java.util.Scanner;

public class July12hw {
    public static void main(String[] args) {
        //1.01
        System.out.println("Hello, world!");

        //1.02
        Scanner input = new Scanner(System.in);
        //int int1 = input.nextInt();
        int int2 = input.nextInt();
        // int int3 = input.nextInt();
        System.out.println(int2);

        //1.03 idk

        //1.04
        double origin = input.nextDouble();
        System.out.printf("%.3f", origin);

        //1.05
        double origin2 = input.nextDouble();
        System.out.printf("%.12f", origin2);

        //1.06
        String data1 = input.next();
        int data2 = input.nextInt();
        double data3 = input.nextDouble();
        double data4 = input.nextDouble();
        System.out.print(data1 + " ");
        System.out.print(data2 + " ");
        System.out.print(data3 + " ");
        System.out.print(data4);

        //1.07 idk

        //1.08
        String pyramid = input.next();
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(pyramid);
        System.out.print(" ");
        System.out.println(" ");
        System.out.print(" ");
        System.out.print(pyramid);
        System.out.print(pyramid);
        System.out.print(pyramid);
        System.out.println(" ");
        for (int i=1;i<6;i++) {
            System.out.print(pyramid);
        }

        //1.09
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

        //2.01
        //int intSample = 1;
        //short shortSample = 1;
        System.out.println("4 bytes  2 bytes");

        //2.02
        //float floatSample = 2;
        //double doubleSample = 2;
        System.out.println("4 bytes  8 bytes");

        //2.03
        //char a = 3;
        //boolean boolSample = true;
        System.out.println("I don't know");

        //2.04
        System.out.println("D idk");

        //2.05
        System.out.println("E D");

        //2.06
        int killDecimal = input.nextInt();
        System.out.println(killDecimal);

        //2.07 idk

        //2.08 idk
        int random = input.nextInt();
        //boolean random2;
        //random2 = random;
        //random = random2;
        System.out.println(random);

        //2.09 idk

        //2.10 idk

        input.close();
    }
}