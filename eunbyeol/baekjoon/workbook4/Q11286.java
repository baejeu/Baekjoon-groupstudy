package eunbyeol.baekjoon.workbook4;

import java.io.*;
import java.util.PriorityQueue;

public class Q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        //낮은 숫자가 우선 순위인 큐 선언
        //큐에 값을 담을 때 값을 비교해서 담는다
        //람다식 -> 익명함수
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>((num1, num2) -> {
            int abs1 = Math.abs(num1);
            int abs2 = Math.abs(num2);
            //절대값이 같을 때
            return abs1 == abs2 ? Integer.compare(num1, num2) : Integer.compare(abs1, abs2);
        });

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            //배열 값이 0 일때
            if (arr[i] == 0){
                if (priorityQueueLowest.size() == 0) bw.write(Integer.toString(0) + "\n");
                else  {
                    bw.write(Integer.toString(priorityQueueLowest.poll()) + "\n");
                }
            }else {
                 priorityQueueLowest.offer(arr[i]);
            }
        }
        bw.flush();
        bw.close();
    }
}
