import java.util.Scanner;


// input 2*3

// first
// 1 2 3
// 2 5 6



// two
//  2 3 6
//  4 5 6





public class MatrixMutliplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] matrix1 = new int[r1][c1];
        for(int row = 0; row < r1; row++){
            for(int col = 0; col < c1 ; col++){
                matrix1[row][col] = scn.nextInt();
            }
        }


        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] matrix2 = new int[r2][c2];

        for (int row2 = 0; row2 < r2; row2++) {
            for (int col2 = 0; col2 < c2; col2++) {
                matrix2[row2][col2] = scn.nextInt();
            }
        }
        scn.close();
        if(c1 != r2) {
            System.out.println("INValid value print");
            return;
        }

        int[][] answer = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++) {
                for (int  k = 0; k < c1; k++) {
                    answer[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
