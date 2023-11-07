package string;

public class sqrt {
    public static int calculateSquareRoot(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root is undefined for negative numbers");
        }

        long r = x;
        while(r*r > x){
            r = (r + x/r) / 2;
        }
        return (int)r;
    }

    public static void main(String[] args) {
        int number = 25;  // Change this to the number for which you want to calculate the square root
        int result = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is approximately " + result);
    }
}
