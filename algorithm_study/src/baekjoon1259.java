import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String num = br.readLine();

            if(Integer.parseInt(num) == 0){
                break;
            }

            int length = num.length();
            for(int i = 0; i < (length + 1)/2; i++){
                if(num.charAt(i) != num.charAt(length - i - 1)){
                    sb.append("no" + "\n");
                    break;
                }
                else if(i == (length + 1)/2 - 1)
                    sb.append("yes" + "\n");
            }

        }
        System.out.println(sb);
    }
}