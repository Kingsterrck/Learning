package LearnAP;
import java.util.Scanner;
import java.util.ArrayList;

public class review1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String a = "123456789";
        // Integer.parseInt(a);
        // System.out.println(a);
        int[] getArr = randomSum();
        System.out.println("sum of numbers between "+getArr[0]+" and "+getArr[1]+" is "+getArr[2]);

        int a = input.nextInt();
        double[] setArr = new double[a];
        for (int i = 0; i<a;i++) {
            double tempp = input.nextDouble();
            setArr[i] = tempp;
        }
        double[] getArray = stat(setArr);
        System.out.println("Max is "+getArray[0]+", mean is "+getArray[1]+", sum is "+getArray[2]);
        input.close();
    }
    public static int[] randomSum() {
        int int1 = (int)(Math.random()*50);
        int int2 = (int)(Math.random()*50+50);
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] returnArr = {int1,int2,0};
        for (int i = int1; i <= int2; i++) {
            arr.add(i);
        }
        for (int i = 0; i < arr.size();i++) {
            sum+=arr.get(i);
        }
        returnArr[2] = sum;
        return returnArr;
    }
    public static double[] stat(double[] arr) {
        double max = 0;
        double mean = 0;
        double sum = 0;
        for (int i = 0;i < arr.length;i++) {
            double temp = arr[i];
            if (temp > max) {
                max = temp;
            }
            sum += temp;
        }
        mean = sum/arr.length;
        double[] returnArr = {max,mean,sum};
        return returnArr;
    }
    public static boolean isPresent(double a, double[] arr) {
        for (double i:arr) {
            if (a == i) {
                return true;
            }
        }
        return false;
    }
    public static String trend(double[] arr) {
        String status = "";
        

        return status;
    }
}
