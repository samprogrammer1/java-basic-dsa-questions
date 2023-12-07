public class SetMatrixZeroes {
    public void row(int[][] matrix, int i){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -10;
            }
        }
    }

    public void col(int[][] matrix, int j){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -10;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        for(int i  =0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row(matrix,i);
                    col(matrix,j);
                }
            }
        }

        for(int i =0; i < matrix.length; i++){
          for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] == -10){
              matrix[i][j] = 0;
            }
          }
        }

    }

    public static void main(String[] args) {
        SetMatrixZeroes solution = new SetMatrixZeroes();
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        solution.setZeroes(matrix);

        System.out.println("\nMatrix after setting zeroes:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}