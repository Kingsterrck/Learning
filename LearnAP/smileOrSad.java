package LearnAP;
import java.util.Scanner;

public class smileOrSad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stat = input.nextLine();
        String temp;
        int smile = 0;
        int sad = 0;
        for (int i = 0;i<stat.length()-2;i++) {
            temp = stat.substring(i,i+3);
            if (temp.equals(":-)")) {
                smile++;
            } else if (temp.equals(":-(")) {
                sad++;
            }
        }
        if (smile > sad) {
            System.out.println("happy");
        } else if (sad > smile) {
            System.out.println("sad");
        } else if (sad == smile && sad != 0) {
            System.out.println("unsure");
        } else {
            System.out.println("none");
        }
        input.close();
    }

    public static String method2(String stat) {
        String mood = "";
        int smile = 0;
        int sad = 0;
        int count = stat.indexOf(":-)"); 
        while (count != -1) {
            smile++;
            count = stat.indexOf(":=)",count);
        }
        count = stat.indexOf(":-(");
        while (count != -1) {
            sad++;
            count = stat.indexOf(":-(",count);
        }
        if (smile > sad) {
            System.out.println("happy");
        } else if (sad > smile) {
            System.out.println("sad");
        } else if (sad == smile && sad != 0) {
            System.out.println("unsure");
        } else {
            System.out.println("none");
        }
        return mood;
    }
}
