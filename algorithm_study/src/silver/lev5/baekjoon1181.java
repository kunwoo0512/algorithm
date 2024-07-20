package silver.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];

        for(int i = 0; i < n; i++){
            list[i] = br.readLine();
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length())
                    return o1.length() - o2.length();
                else{
                    for(int i = 0; i < o1.length(); i++){
                        if(o1.charAt(i) != o2.charAt(i))
                            return o1.charAt(i) - o2.charAt(i);
                    }
                    return 0;
                }
            }
        });

        list = Arrays.stream(list).distinct().toArray(String[]::new);

        for(int i = 0; i < list.length; i++){
            sb.append(list[i] + "\n");
        }
        System.out.println(sb);

    }
}
