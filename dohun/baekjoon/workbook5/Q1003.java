package dohun.baekjoon.workbook5;

import java.io.*;

public class Q1003 {
    private static int[][] dp = new int[41][2];
    public static void fibonacci(int n) {
        // 이미 계산한 값인 경우 바로 반환
        if (dp[n][0] != 0 || dp[n][1] != 0) {
            return;
        }

        // 계산하지 않은 경우 다이나믹 프로그래밍으로 계산
        // 재귀적으로 또 호출하면서 dp 배열에 이미 계산된 결과가 있으면 시간이 단축된다
        fibonacci(n - 1);
        fibonacci(n - 2);

        // 결과 계산
        dp[n][0] = dp[n - 1][0] + dp[n - 2][0];
        dp[n][1] = dp[n - 1][1] + dp[n - 2][1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 초기값 설정 // fibonacci(2) 부터는 계산한경우 안한경우를 찾기 시작??
        dp[0][0] = 1;
        dp[1][1] = 1;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());

            fibonacci(n);

            bw.write(dp[n][0] + " " + dp[n][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

//public class Q1003 {
//    private int[] arr = new int[2];
//    public int[] getArr() {
//        return arr;
//    }
//
//    public int fibonacci(int num) {
//        if (num == 0) {
//            return arr[0]++;
//        } else if (num == 1) {
//            return arr[1]++;
//        } else {
//            return fibonacci(num - 1) + fibonacci(num - 2);
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int testCase = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < testCase; i++) {
//            Q1003 q1003 = new Q1003();
//            int n = Integer.parseInt(br.readLine());
//            q1003.fibonacci(n);
//            bw.write(q1003.arr[0] + " " + q1003.arr[1] + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
//}

