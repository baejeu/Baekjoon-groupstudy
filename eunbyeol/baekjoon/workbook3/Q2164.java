package eunbyeol.baekjoon.workbook3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.remove();
            queue.add(queue.remove());
        }
        bw.write(Integer.toString(queue.remove()));

        bw.flush();
        bw.close();
    }
}