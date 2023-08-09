import java.util.*;

public class isPrime {
    public static void solution(ArrayList<Integer> arr){
        for(int i= arr.size() - 1; i >= 0; i--){
            if(isPrimeCheck(arr.get(i))){
                arr.remove(i);
            }
        }
    }

    public static boolean isPrimeCheck(int n) {

        for(int div = 2; div * div <= n; div++){
            if(n % div == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i  = 0; i < n;  i++){
            arr.add(scn.nextInt());
        }

        solution(arr);
        System.out.print(arr);
    }
}
