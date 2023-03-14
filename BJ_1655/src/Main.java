import java.io.BufferedReader;
import java.util.Collections;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> pql = new PriorityQueue<>();
        PriorityQueue<Integer> pqh = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n ; i++){
            int tmp = Integer.parseInt(br.readLine());

            if(pql.size() == pqh.size()){
                pqh.offer(tmp);
            }
            else{
                pql.offer(tmp);
            }

            if(pqh.peek() >= pql.peek()){
                int a = pql.poll();
                pql.offer(pqh.poll());
                pqh.offer(a);
            }
            System.out.println(pqh.peek());
        }
    }
}
