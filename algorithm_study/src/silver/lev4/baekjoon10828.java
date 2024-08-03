package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10828 {
    public static int[] stack;
    public static int top = -1;

    public static void push(int num){
        top++;
        stack[top] = num;
    }

    public static int pop(){
        if(top == -1)
            return  -1;
        else{
            int cur = stack[top];
            top--;
            return cur;
        }
    }

    public static int stackSize(){
        return top + 1;
    }

    public static int isEmpty(){
        if(stackSize() == 0)
            return 1;
        else
            return 0;
    }

    public static int stackTop(){
        if(stackSize() == 0)
            return -1;
        else
            return stack[top];

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        stack = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()," ");
            String method = st.nextToken();
            if(method.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                push(num);
            }
            else if(method.equals("pop")){
                int popInt = pop();
                sb.append(popInt + "\n");
            }
            else if(method.equals("size")){
                int size = stackSize();
                sb.append(size + "\n");
            }
            else if(method.equals("empty")){
                int isEmpty = isEmpty();
                sb.append(isEmpty + "\n");
            }
            else if(method.equals("top")){
                int top = stackTop();
                sb.append(top + "\n");
            }
        }

        System.out.println(sb);
    }
}
