import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _90degreeRotate {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        rotateby90(arr);
        display(arr);
    }
        
    public static void rotateby90(int[][] arr) {
        // transpose
        for(int i =0; i < arr.length; i++){
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[0].length - 1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
