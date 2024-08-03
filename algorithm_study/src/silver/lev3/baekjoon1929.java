package silver.lev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] prime = new int[m+1];

        prime[0] = prime[1] = 1;
        for(int j = 2; j <= Math.sqrt(prime.length); j++){
            if(prime[j] == 0){
                for(int i = j*j; i < m+1; i = i+j){
                    prime[i] = 1;
                }
            }
        }
        //n부터 m까지의 수 검사
        for(int i = n; i <= m; i++) {
            if (prime[i] == 0) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }
}
