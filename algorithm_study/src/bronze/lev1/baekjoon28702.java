package bronze.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[3];
        int num = 0; int idx = -1;

        for(int i = 0; i < 3; i++){
            list[i] = br.readLine();
            if(list[i].matches("-?\\d+(\\.\\d+)?")){
                num = Integer.parseInt(list[i]);
                idx = i;
            }
        }

        if(num == 0)
            System.out.println("FizzBuzz");
        else{
            int result = num + 3 - idx;
            if(result % 3 == 0 && result % 5 == 0)
                System.out.println("FizzBuzz");
            else if(result % 3 == 0)
                System.out.println("Fizz");
            else if(result % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(result);
        }
    }
}
