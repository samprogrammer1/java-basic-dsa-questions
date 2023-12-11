public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int id = 0;
        for(int i = 0; i < nums.length; i++){
            id ^= nums[i];
        }
        return id;
    }

    public static void main(String[] args){
        int[] res = new int[]{1,2,3,2,3};

        System.out.println(singleNumber(res));
    }
}
