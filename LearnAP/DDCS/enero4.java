package LearnAP.DDCS;

public class enero4 {
    public static void main(String[] args) {
        int[][] scoreTable = {{91,85,72,80},{81,75,89,92},{68,88,95,82},{88,80,90,62}};
        int sum;
        for (int row = 0;row<4;row++) {
            sum = 0;
            for (int col = 0;col<4;col++) {
                sum += scoreTable[row][col];
            }
            sum /= 4;
            System.out.print(sum + " ");
        }
        System.out.println("");
        for (int row = 0;row<4;row++) {
            sum = 0;
            for (int col = 0;col<4;col++) {
                sum += scoreTable[col][row];
            }
            sum /= 4;
            System.out.print(sum + " ");
        }
    }
}
