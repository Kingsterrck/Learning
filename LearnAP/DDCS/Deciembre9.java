package LearnAP.DDCS;
import java.util.Scanner;

public class Deciembre9 {
    public static void main(String[] args) {
        // int[] unusedBox = {2,3,5,8,12,13,16,19,20};
        // System.out.println("There are "+unusedBox.length+" unused boxes");
        // for (int i : unusedBox) {
        //     System.out.println(i);
        // }
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int[] randList = new int[n];
        for (int i = 0;i<n;i++) {
            randList[i] = (int)(1000*Math.random());
        }
        int smallest = randList[0];
        for (int i = 1;i < n;i++) {
            if (randList[i] < smallest) {
                smallest = randList[i];
            }
        }
        System.out.println(smallest);
        input.close();
    }
}
