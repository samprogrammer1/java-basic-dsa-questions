import java.util.Scanner;

public class search_in_a_2d_sorted_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] array = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                array[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();

        int row = 0;
        int col = n - 1;

        while(row < n && col >= 0){
            if(array[row][col] == data){
                System.out.println(row);
                System.out.println(col);
                return;
            }

            if(array[row][col] > data){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("Not Found");
    }
}
