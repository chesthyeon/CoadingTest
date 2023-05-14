/// https://www.acmicpc.net/problem/2839
/// 설탕 배달
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /// 설탕 무게 = n
        int n = Integer.parseInt(br.readLine());
        //설탕 봉지는 3, 5
        final int sugar3 = 3;
        final int sugar5 = 5;
        int ans = 0;

        while (n % sugar5 > 0) {
            n -= sugar3;
            ans += 1;
        }
        if(n % 5 != 0){
            System.out.println(-1);
            return;
        }
        System.out.println(ans + n / sugar5);
    }
}