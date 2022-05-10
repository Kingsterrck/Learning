import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        start++;
        int startStore = start;
        boolean stat = false;
        while (stat == false) {
            start = startStore;
            ArrayList<Integer> numList = new ArrayList<Integer>();
            while (start != 0) {
                numList.add(0, start % 10);
                start /= 10;
            }
            for (int i = 0; i < numList.size(); i++) {
                for (int k = 0; k < numList.size(); k++) {
                    if (numList.get(k) == numList.get(i) && k != i) {
                        stat = true; //duplicate
                    }
                }   
            }
            if (stat) { //duplicate
                stat = false;
            } else {
                stat = true;
            }
            startStore++;
        }
        System.out.println(startStore-1);
        input.close();
    }
}