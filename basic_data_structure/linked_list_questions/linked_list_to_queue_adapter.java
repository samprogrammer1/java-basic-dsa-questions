package linked_list_questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class linked_list_to_queue_adapter {
    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            // write your code here
            return list.size();
        }

        void add(int val) {
            // write your code here
            list.addLast(val);
        }

        int remove() {
            // write your code here
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
        }

        int peek() {
            // write your code here
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return list.getFirst();
            }
        }

        LinkedList<Integer> display() {
            if(size() == 0){
                System.out.println("stack underflow");
                return list;
            }else{
                return list;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToQueueAdapter qu = new LLToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }else if(str.startsWith("display")){
                LinkedList<Integer> items = qu.display();
                System.out.print("[");
                for (int i = 0; i < items.size(); i++) {
                    System.out.print(items.get(i) + " ");
                }
                System.out.print("]");
                System.out.println();
            }
            str = br.readLine();
        }
    }
}
