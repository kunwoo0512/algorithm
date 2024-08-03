package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> nlist = new LinkedHashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(nlist.get(num) != null){
                nlist.put(num, nlist.get(num) + 1);
            } else{
                nlist.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            int howMany;

            if(nlist.get(num) != null){
                howMany = nlist.get(num);
            } else{
                howMany = 0;
            }
            sb.append(howMany + " ");
        }

        System.out.println(sb);
    }
}
