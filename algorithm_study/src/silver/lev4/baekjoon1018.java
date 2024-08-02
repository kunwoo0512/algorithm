package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1018 {

    public static String[][] list;
    public static int min = 64;

    public static void find(int i, int j, boolean isRight){
        int cnt = 0;
        for(int k1 = i; k1 < i+8; k1++){
            for(int l1 = j; l1 < j+8; l1++){
                if(isRight){
                    if(list[k1][l1].equals("W")){
                        cnt++;
                    }
                    isRight = false;
                }
                else{
                    if(list[k1][l1].equals("B")){
                        cnt++;
                    }
                    isRight = true;
                }
            }
            isRight = !isRight;
        }
        if(cnt < min)
            min = cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new String[n][m];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                list[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for(int i = 0; i <= n-8; i++){
            for(int j = 0; j <= m-8; j++){

                //첫 블록이 B인 경우
                find(i, j, true);
                find(i, j, false);
            }
        }
        System.out.println(min);
    }
}
