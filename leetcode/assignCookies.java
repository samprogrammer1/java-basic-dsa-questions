import java.util.Arrays;

public class assignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length;
        int n = s.length;

        int i = 0, j = 0;

        while(i < m && j < n){
            if(g[i] <= s[j]){//setifiable
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {

        int g1[] = {1, 2, 3};
        int s1[] = {1, 1};
        System.out.println(findContentChildren(g1, s1));

        int g2[] = {1, 2};
        int s2[] = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2));
    }
}
