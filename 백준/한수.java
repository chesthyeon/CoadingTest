/// https://www.acmicpc.net/problem/1065
/// 한수
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        if (n < 100) {
            System.out.println(n);
            return;
        }
        int ans = 99;
        for (int i = 100; i <= n; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (a - b == b - c){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}