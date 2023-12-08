import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    
    public static void main(String[] args) {
        int numRows1 = 5;
        System.out.println(generate(numRows1));

        int numRows2 = 1;
        System.out.println(generate(numRows2));
    }

    public static List<Integer> rowGenerate(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / (col);
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <=numRows; i++){
            ans.add(rowGenerate(i));
        }

        return ans;
    }
}
