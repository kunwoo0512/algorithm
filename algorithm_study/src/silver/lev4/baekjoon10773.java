package silver.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        //더할 숫자 개수만큼 반복
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            //0이 아니면 stack에 push, 0이면 하나를 제거
            if(num != 0){
                stack.push(num);
            }
            else{
                stack.pop();
            }
        }

        //stack에 남아잇는 수를 더함
        int sum = 0;
        for(int e : stack){
            sum += e;
        }

        System.out.println(sum);

        //stack 말고 자체구현하여 푸는 방법

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] list = new int[n];
//
//        int cur = 0;
//        for(int i = 0; i < n; i++){
//            int num = Integer.parseInt(br.readLine());
//            if(num != 0){
//                list[cur] = num;
//                cur++;
//            }
//            else{
//                cur--;
//            }
//        }
//
//        int sum = 0;
//        for(int i = 0; i < cur; i++){
//            sum += list[i];
//        }
//
//        System.out.println(sum);

    }
}
