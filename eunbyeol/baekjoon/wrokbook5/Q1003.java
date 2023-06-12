package eunbyeol.baekjoon.wrokbook5;

import java.io.*;

public class Q1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[][] fiboArr = new int[41][2];
        int[] arr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //초기화
        fiboArr[0][0] = 1;
        fiboArr[0][1] = 0;
        fiboArr[1][0] = 0;
        fiboArr[1][1] = 1;

        //Bottom-up 방식
        //이차원 배열에 0,1 횟수 저장
        for (int i = 2; i < 41; i++) {
            fiboArr[i][0] = fiboArr[i-1][0] + fiboArr[i-2][0];
            fiboArr[i][1] = fiboArr[i-1][1] + fiboArr[i-2][1];
        }

        //테스트 케이스가 저장된 arr 배열을 반복해서 결과 출력
        for (int num : arr){
            bw.write(Integer.toString(fiboArr[num][0])+ " " + Integer.toString(fiboArr[num][1])+ "\n");
        }

        bw.flush();
        bw.close();
    }

}
