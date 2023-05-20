/// https://www.acmicpc.net/problem/11399
/// ATM
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /// 입력
        final int n = Integer.parseInt(br.readLine());
        int waitTime = 0;
        int sumTime = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /// 정렬
        Arrays.sort(arr);
        /// 시간을 구히기 위한 알고리즘
        for (int i = 0; i < n; i++) {
            int time = arr[i];
            waitTime += time;
            sumTime += waitTime;
        }
        System.out.println(sumTime);
    }
}