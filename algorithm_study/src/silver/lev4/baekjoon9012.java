package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            String isBalance = "YES";

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch == '(')
                    stack.push('(');
                else if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '(') {
                        isBalance = "NO";
                        break;
                    }
                }
            }
            if(!stack.isEmpty())
                isBalance = "NO";
            System.out.println(isBalance);
            stack.clear();
        }
    }
}
