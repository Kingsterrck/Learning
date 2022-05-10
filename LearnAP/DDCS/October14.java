package LearnAP.DDCS;
import java.util.Scanner;

public class October14 {
    public static void main(String[] args) {
        
        // int year = input.nextInt();
        // if (year % 4 == 0) {
        //     if (year % 100 != 0) {
        //         if (year % 400 == 0) {
        //             System.out.println("run");
        //         }
        //     }
        // }
        // input.close();

        // boolean a = true;
        // boolean b = false;
        // System.out.println((a == !b) != false);
        
        
        // if (month.equals("january")||month.equals("march")||month.equals("may")||month.equals("july")||month.equals("august")||month.equals("october")||month.equals("december")) {
        //     System.out.println("31");
        // } else if (month.equals("feburary")) {
        //     System.out.println("28");
        // } else {
        //     System.out.println("30");
        // }
        // input.close();

        Scanner input = new Scanner(System.in);
        String month = input.nextLine();
        if (month.equals("december")||month.equals("january")||month.equals("feburary")){
            System.out.println("winter");
        } else if (month.equals("march")||month.equals("april")||month.equals("may")) {
            System.out.println("spring");
        } else if (month.equals("october")||month.equals("november")){
            System.out.println("fall");
        } else {
            System.out.println("summer");
        }
        input.close();
    }
}
