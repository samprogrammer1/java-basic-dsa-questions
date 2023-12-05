public class FlipAndInvertImage {
    public static void swap(int[] row) {
        int i = 0;
        int j = row.length -1;
        while(i < j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            swap(image[i]);
            for(int j = 0; j < image[0].length; j++){
                if(image[i][j] == 0){
                   image[i][j] = 1; 
                }else{
                    image[i][j] = 0; 
                }
            }
        }
        
        return image;
    }


    public static void main(String[] args) {

        // Example usage:
        int[][] inputMatrix = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        System.out.println("Original Image:");
        printMatrix(inputMatrix);

        int[][] flippedAndInvertedImage = flipAndInvertImage(inputMatrix);

        System.out.println("\nFlipped and Inverted Image:");
        printMatrix(flippedAndInvertedImage);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
