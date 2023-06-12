package eunbyeol.baekjoon.workbook4;

import java.io.*;
import java.util.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int N, M;
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            //테스트 케이스 첫번째 줄
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int cnt = 0;
            //int 배열을 요소로 가지는 큐 선언
            Queue<int[]> queue = new LinkedList();

            //테스트 케이스 두번째 줄
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                //{인덱스, 우선순위}
                int[] arr = {j, Integer.parseInt(st.nextToken())};
                queue.offer(arr);
            }
            while (!queue.isEmpty()){
                //큐에 맨 앞에 값 삭제
                int[] nowVal = queue.poll();
                boolean check = true;

                for (int[] q : queue){
                    //우선순위가 더 높으면
                    //q[1] -> queue의 각 원소(길이 2)의 두번재 값인 우선순위
                    if (q[1] > nowVal[1]) {
                        check = false;
                        break;
                    }
                }
                //우선순위 높은게 없을 시
                if (check){
                    cnt ++;
                    //우선순위의 인덱스가 M이랑 같을때
                    if(nowVal[0] == M) break;
                }else {
                    //맨 앞의 우선순위가 M이랑 다를때 위에서 삭제한 값을 추가한다
                    queue.offer(nowVal);
                }
            }
            bw.write(Integer.toString(cnt)+ "\n");

        }
        bw.flush();
        bw.close();

    }
}
