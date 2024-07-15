package bronze.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        double max = 0;
        double sum = 0;
        for(int i = 0; i < n; i++){
            double score = Double.parseDouble(st.nextToken());
            sum += score;
            if(score > max)
                max = score;
        }

        System.out.println(sum/max/n*100);
    }
}
