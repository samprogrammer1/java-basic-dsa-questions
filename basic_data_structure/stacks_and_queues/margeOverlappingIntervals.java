package stacks_and_queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class margeOverlappingIntervals {
    public static void main(String[] args) throws Exception {
         // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] pair = new Pair[arr.length];

        for(int i = 0 ;  i < arr.length; i++){
            pair[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pair);

        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < pair.length; i++){
            if(i == 0) {
                st.push(pair[i]);
            }else{
                Pair top = st.peek();
                if(pair[i].st > top.et){
                    st.push(pair[i]);
                }else{
                    top.et = Math.max(top.et, pair[i].et);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();

        while(st.size() > 0){
            rs.push(st.pop());
        }

        while (rs.size() > 0) {
            Pair p = rs.pop();
            System.out.println(p.st + " "+ p.et);
        }
    }

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st , int et){
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other ){
            if(this.st != other.st){
                return this.st -other.st ;
            }else{
                return this.et-other.et;
            }
        }

    }
}
