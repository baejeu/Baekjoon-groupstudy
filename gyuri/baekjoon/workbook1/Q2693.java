package gyuri.baekjoon.workbook1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        for(int i=0; i<T; i++) {
            for(int j=0; j<10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
