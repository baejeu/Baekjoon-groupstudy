package eunbyeol.baekjoon.datastructure;

import java.io.*;
import java.util.Stack;

public class Q9012 {
    //방법 1. Stack 사용
    public static boolean bracketArr(String input) throws IOException {
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char bracket = input.charAt(i);

            //1. 여는 괄호를 만날때 push
            if(bracket == '('){
                charStack.push(bracket);
            }
            //2. 닫는 괄호를 만날 경우
            else if (bracket == ')') {
                //a. pop 할게 없으면 검사 실패(false 반환) -> 스택이 비어있다
                if (charStack.empty()) return false;
                char top = charStack.pop();
            }
        }
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            if (bracketArr(br.readLine())) bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
        }
        bw.flush();
        bw.close();
    }

/*  방법 1. replace 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            while (input.indexOf("()") != -1){
                input = input.replace("()", "");
            }
            if (input.length() == 0) bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
        }

        bw.flush();
        bw.close();
    }*/

}
