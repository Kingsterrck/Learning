import java.util.Scanner;
public class August11 {
    public static void main(String[] args) {
        double[] myList = new double[10];
        // for (int i = 0; i < myList.length; i++) {
        //     myList[i] = i;
        // }
        // System.out.println(myList[1]);

        Scanner input = new Scanner(System.in);
        System.out.println("enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i]=input.nextDouble();
        }
        double max = myList[0];
        double loc = 0;
        for (int i =0;i<myList.length;i++) {
            if (myList[i] > max) {
                max = myList[i];
                loc = i;
            }
        }
        // System.out.println(max + " at " + loc);

        // double temp;
        // for (int i = 0;i<myList.length;i++){
        //     loc = (int)(Math.random()*myList.length);
        //     temp = myList[i];
        //     myList[i] = myList[loc];
        //     myList[loc] = temp;
        //     System.out.println(loc);
        // }
        // for (int i = 0;i<myList.length;i++) {
        //     System.out.print(myList[i] + ", ");
        // }

        loc = myList[0];
        for (int i = 0; i<myList.length-1;i++) {
            myList[i] = myList[i+1];
        }
        myList[myList.length-1]=loc;
        for (int i = 0;i<myList.length;i++) {
                System.out.print(myList[i] + ", ");
            }
        input.close();
    }
}
