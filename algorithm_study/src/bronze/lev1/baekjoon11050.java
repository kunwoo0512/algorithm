package bronze.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11050 {
    static int[][] list;

    static int BC(int n, int k){

        if(list[n][k] > 0)
            return list[n][k];

        if(n == k || k == 0)
            return list[n][k] = 1;

        return list[n][k] = BC(n-1, k-1) + BC(n-1, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        list = new int[n+1][k+1];

        int result = BC(n, k);

        System.out.println(result);

//        int dem = 1;
//        for(int i = 0; i < k; i++){
//            dem *= n;
//            n--;
//        }
//
//        int num = 1;
//        int temp = k;
//        for(int i = 0; i < k; i++){
//            num *= temp;
//            temp--;
//        }
//
//        System.out.println(dem/num);

    }
}
