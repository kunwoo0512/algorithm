package bronze.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int max = 1; int min = 0;

        int i = 2;
        while(i <= n1 && i <= n2){
            if(n1 % i == 0 && n2 % i == 0)
                max = i;
            i++;
        }

        min = max * (n1/max) * (n2/max);

        System.out.println(max + "\n" + min);

    }
}

