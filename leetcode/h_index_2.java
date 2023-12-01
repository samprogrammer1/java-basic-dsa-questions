
public class h_index_2 {
    public static int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length - 1;
        int n = citations.length;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(citations[mid] == n - mid){
                return n - mid;
            }else if(citations[mid] < n - mid){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return n - left;
    }
    public static void main(String[] args) {
        int[] citations1 = {0, 1, 3, 5, 6};
        int[] citations2 = {1, 2, 100};

        int hIndex1 = hIndex(citations1);
        int hIndex2 = hIndex(citations2);

        System.out.println("H-Index 1: " + hIndex1); // Output: 3
        System.out.println("H-Index 2: " + hIndex2); // Output: 2
    }
}
