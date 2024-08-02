package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while(n > 0){
            if(n % 5 == 0){
                cnt += n/5;
                n = 0;
            }
            else{
                cnt++;
                n = n - 3;
            }
        }
        if(n < 0)
            cnt = -1;

        System.out.println(cnt);
    }
}
