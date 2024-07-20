package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cur = 1;
        int i = 666;
        while(cur != n){
            i++;
            String str = Integer.toString(i);
            if(str.contains("666"))
                cur++;
        }

        System.out.println(i);
    }
}
