package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()," ");
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int rank = 1;
            for(int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                else if (list[i][0] < list[j][0] && list[i][1] < list[j][1])
                    rank++;
            }
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}
