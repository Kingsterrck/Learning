package LearnAP;
import java.util.Scanner;
public class oucc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ppl = input.nextInt();
        int distance = input.nextInt();
        int car = ppl / 4;
        int pplLeft = ppl % 4;
        if (pplLeft == 0) {
            System.out.println(distance*car*130);
        } else if (pplLeft == 1) {
            System.out.println((car*130+100)*distance);
        } else {
            System.out.println((car*130+100+(pplLeft-1)*10)*distance);
        }
        input.close();
    }
}