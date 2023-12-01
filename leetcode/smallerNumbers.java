public class smallerNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && i != j){
                    count++;
                }
            }

            res[i] = count;
        }

        return res;
    }

    public static void main(String[] args){
        int[] value = {8,1,2,2,3};

        value = smallerNumbersThanCurrent(value);

        for(int n : value){
            System.out.println(n);
        }
        
    }
}
