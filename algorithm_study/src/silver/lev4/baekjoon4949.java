package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        while(true){
            String str = br.readLine();
            if(str.equals("."))
                break;
            String isBalance = "yes";

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                if( ch == '(')
                    stack.push('(');
                else if( ch == '[')
                    stack.push('[');
                else if( ch == ')'){
                    if( stack.isEmpty() || stack.pop() != '('){
                        isBalance = "no";
                        break;
                    }
                }
                else if( ch == ']' ){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isBalance = "no";
                        break;
                    }
                }
            }
            if(!stack.isEmpty())
                isBalance = "no";
            System.out.println(isBalance);
            stack.clear();
        }
    }
}
