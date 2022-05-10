package LearnAP.DDCS;

public class Deciembre7 {
    public static void main(String[] args) {
        // int meter = 0;
        // int day = 0;
        // while (true) {
        //     day++;
        //     meter += 2;
        //     if (meter >= 10) {
        //         break;
        //     } else {
        //         meter --;
        //     }
        // }
        // System.out.println(day);
        boolean isPrime = true;
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            for (int divident = 2; divident < i; divident++) {
                if (i%divident == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.print(i+", ");
                count++;
            }
            isPrime = true;
        }
        System.out.println("there are "+count+" prime numbers");
    }
}
