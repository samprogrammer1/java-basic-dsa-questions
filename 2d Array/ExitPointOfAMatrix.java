import java.util.*;

public class ExitPointOfAMatrix {
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

        int dir = 0 ; // e->0; south->1; west->2; north -> 3;
        int i =0, j = 0; 

        while (true) {
            dir = (dir + matrix[i][j]) % 4;

             if(dir == 0){
                j++;  // on the whay east side, ( j ) is change the column value
             }else if(dir == 1){
                i++; // one the why south side , [i] is change the row value
             }else if(dir == 2) {
                j--; // on the why west side value target [j] is change column value
             }else if(dir == 3) {
                i--; // one the why south side value target [i] is change row value
             }

             if(i < 0){
                i++;
                break;
             }else if(j < 0 ){
                j++;
                break;
             }else if(i == n){
                i--;
                break;
             }else if(j == m){
                j--;
                break;
             }

        }

        System.out.println(i);
        System.out.println(j);

    }
}
