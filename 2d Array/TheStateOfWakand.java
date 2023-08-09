import java.util.Scanner;

public class TheStateOfWakand {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int[][] array = new int[n][n];

        for(int i =0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for(int gap = 0; gap < array.length; gap++){
            for (int i = 0, j = gap; j < array[0].length; j++, i++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
