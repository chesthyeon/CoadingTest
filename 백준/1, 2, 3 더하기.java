/// https://www.acmicpc.net/problem/9095
/// 1, 2, 3 더하기

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int t = Integer.parseInt(br.readLine());
        int[] sums = new int[11];
        StringBuilder sb = new StringBuilder();
        sums[1] = 1;
        sums[2] = 2;
        sums[3] = 4;
        for (int i = 4; i < sums.length; i++) {
            sums[i] = sums[i - 1] + sums[i - 2] + sums[i - 3];
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(sums[n]).append("\n");
        }
        System.out.println(sb);
    }
}