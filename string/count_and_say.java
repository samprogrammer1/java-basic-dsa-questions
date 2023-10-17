package string;

public class count_and_say {
    public static String CountAndSay(int n) {
        String val = "1";
        for(int i = 1; i < n; i++){
            char c = val.charAt(0);

            StringBuilder s = new StringBuilder();

            int count =1;
            for(int j = 1; j < val.length(); j++){
                if(c != val.charAt(j)){
                    s.append(count);
                    s.append(c);
                    count= 0;
                    c= val.charAt(j);
                }
                count++;
            }

            s.append(count);
            s.append(c);
            val = s.toString();
        }
        return val;
    }
    public static void main(String[] args) {
        int n = 4;
        String result = CountAndSay(n);
        System.out.println(result); // Output should be true
    }
}
