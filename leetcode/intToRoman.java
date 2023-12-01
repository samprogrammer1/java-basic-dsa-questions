
public class intToRoman {
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    public static String intToRomanString(int num) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; num > 0; i++){
            while(num >= val[i]){
                ans.append(rom[i]);
                num -= val[i];
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        // Example usage
        int num = 58; // Replace this with the desired integer

        // Call the intToRoman method to convert the integer to Roman numeral
        String result = intToRomanString(num);

        // Print the result
        System.out.println("Roman numeral for " + num + " is: " + result);
    }
}
