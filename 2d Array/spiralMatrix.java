import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        scn.close();

        int minrow = 0;
        int maxrow = matrix.length - 1;
        int mincol = 0;
        int maxcol = matrix[0].length - 1;

        int totalElement = n * m;
        int count = 0;

        while(count < totalElement){

            //left wall
            if(count < totalElement){
                for(int i = minrow; i <= maxrow; i++){
                    System.out.println(matrix[i][mincol]);
                    count++;
                }
            }
            mincol++;

            //bottom wall
            if(count < totalElement){
                for(int i = mincol; i <= maxcol; i++){
                    System.out.println(matrix[maxrow][i]);
                    count++;
                }
            }
            maxrow--;

            // right wall
            if(count < totalElement){
                for(int i = maxrow; i >= minrow; i--){
                    System.out.println(matrix[i][maxcol]);
                    count++;
                }
            }
            maxcol--;

            //top wall

            if(count < totalElement){
                for (int i = maxcol; i >= mincol; i--) {
                    System.out.println(matrix[minrow][i]);
                    count++;
                }
            }
            minrow++;

        }
    }
}
