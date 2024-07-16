package bronze.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];

        for(int i = 0; i < 15; i++){
            apart[0][i] = i;
            apart[i][0] = 0;
        }

        for(int i = 0; i < num; i++){
            int floor = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int j = 1; j <= floor; j++){
                for(int k = 1; k <= n; k++){
                    apart[j][k] = apart[j-1][k] + apart[j][k-1];
                }
            }

            sb.append(apart[floor][n] + "\n");
        }
        System.out.println(sb);
    }
}
