import java.util.Scanner;

public class TheStateOfWakanda {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();

        int[][] matrix = new int[r][r];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < r; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }
        scn.close();
        System.out.println("start");
        for(int gap = 0; gap < matrix.length; gap++){
            for(int i =0, j = gap; j < matrix.length; i++,j++){
                System.out.println(matrix[i][j]);
            }
        }
       
        

    }
}
