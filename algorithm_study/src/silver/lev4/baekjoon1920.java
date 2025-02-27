package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> a = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            a.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        int[] list = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        for(int e1 : list){
            if(a.containsKey(e1)){
                sb.append(1 + "\n");
            }
            else{
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }
}
