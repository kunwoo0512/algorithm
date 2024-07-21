package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baekjoon1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger fact = new BigInteger("1");
        for(int i = 1; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String str = fact.toString();

        int cnt = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '0'){
                cnt++;
            }
            else
                break;

        }

        System.out.println(cnt);
    }
}
