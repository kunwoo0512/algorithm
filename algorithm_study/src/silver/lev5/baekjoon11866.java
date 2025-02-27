package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            for(int j = 0; j < k; j++){
                int num = queue.remove();
                if(j != k - 1)
                    queue.add(num);
                else
                    sb.append(num + ", ");
            }
        }


        sb.append(queue.remove()).append(">");
        System.out.println(sb);
    }
}
