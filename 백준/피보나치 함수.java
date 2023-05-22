/// https://www.acmicpc.net/problem/1003
/// 피보나치 함수

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int[][] fibonacci_arr = new int[41][2];
        StringBuilder sb = new StringBuilder();
        fibonacci_arr[0][0] = 1;
        fibonacci_arr[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            fibonacci_arr[i][0] = fibonacci_arr[i - 1][0] + fibonacci_arr[i - 2][0];
            fibonacci_arr[i][1] = fibonacci_arr[i - 1][1] + fibonacci_arr[i - 2][1];
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(fibonacci_arr[num][0]).append(" ").append(fibonacci_arr[num][1]).append("\n");
        }
        System.out.println(sb);
    }
}