package LearnAP.DDCS;

public class pascalTriangle {
    public static void main(String[] args) {
        int pascal[][] = new int[10][10];
        for (int i = 0;i<10;i++) { //for every row
            pascal[i][0] = 1; //
            for (int k = 1;k<10;k++) { //for every column
                if (k > i) {
                    break;
                } else if (k == i) {
                    pascal[i][k] = 1;
                } else {
                    pascal[i][k] = pascal[i-1][k-1] + pascal[i-1][k];
                }
            }
        }
        for (int i = 0;i<10;i++) {
            for (int k = 0;k<10;k++) {
                if (pascal[i][k] == 0) {
                    System.out.println("");
                    break;
                } else {
                    System.out.print(pascal[i][k] + " ");
                }
            }
        }
    }
}
