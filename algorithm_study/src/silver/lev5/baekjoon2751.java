package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for(int i = 0; i < n; i++){
            sb.append(list[i] + "\n");
        }

        System.out.println(sb);
    }
}
