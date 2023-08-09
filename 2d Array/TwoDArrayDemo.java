import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] array = new int[r][c];

        for(int row = 0; row < r; row++ ){
            for(int col = 0;  col < c; col++){
                array[row][col] = scn.nextInt();
            }
        }
        scn.close();
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
