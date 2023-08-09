import java.util.*;
public class saddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();

        int[][] array = new int[n][n];
        for(int i = 0; i < array.length; i++ ){
            for(int j = 0; j < array[0].length; j++){
                array[i][j]  = scn.nextInt();
            }
        }

        for(int i = 0; i < array.length; i++){
            int svj = 0;
            for (int j = 1; j < array[0].length; j++) {
                if(array[i][j] < array[i][svj]){
                    svj = j;
                }
            }
            boolean flag = true;
            for(int k =0;k < array.length; k++){
                if(array[k][svj] > array[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(array[i][svj]);
                return;
            }
        }
        System.out.print("Invalid");
    }
}
