/// https://www.acmicpc.net/problem/11047
// 동전 0
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        for (int i = n - 1; i >= 0; i--) {
            int coin = k / coins[i];
            k = k % coins[i];
            ans += coin;
        }
        System.out.println(ans);
    }
}