package LearnAP;
import java.util.Scanner;

public class August18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //System.out.println("enter a nonnegative integer ");
        //System.out.println("enter the base: ");
        //int x = input.nextInt();
        //System.out.println("enter the power:");
        //int n = input.nextInt();
        //System.out.println("The factorial of " + n + " is " + factorial(n));
        //System.out.println(powerOfTwo(n,x));
        //System.out.println(keepAdding(n));

        String s = input.next();
        System.out.println(isPalindrome(s));
        input.close();
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n *factorial(n-1); //5*4*3*2*1*1
        }
    }
    public static long powerOfTwo(int n,int x) {
        if (n == 0) {
            return 1;
        } else {
            return x * powerOfTwo(n-1,x);
        }
    }
    public static long keepAdding(int n) {
        if (n==0) {
            return 0;
        } else {
            return n + keepAdding(n-1);
        }
    }
        public static boolean isPalindrome(String s) {
            if (s.length() <= 1) {
                return true;
            } else if (s.charAt(0) != s.charAt(s.length()-1)) {
                return false;
            } else {
                return isPalindrome(s.substring(1, s.length()-1));
            }
        }
}