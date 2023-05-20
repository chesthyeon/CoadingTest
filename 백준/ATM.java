/// https://www.acmicpc.net/problem/2941
/// 크로아티아 알파벳
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int waitTime = 0;
        int sumTime = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int time = arr[i];
            waitTime += time;
            sumTime += waitTime;
        }
        System.out.println(sumTime);
    }
}