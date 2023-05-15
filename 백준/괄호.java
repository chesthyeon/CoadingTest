/// https://www.acmicpc.net/problem/9012
/// 괄호
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String no = "NO";
        final String yes = "YES";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cur = 0;
            char[] brackets = br.readLine().toCharArray();
            for (char bracket : brackets) {
                if (bracket == '(') {
                    cur += 1;
                }
                else {
                    cur -= 1;
                }
                if (cur < 0) {
                    cur = 1;
                    break;
                }
            }
            if (cur == 0) {
                sb.append(yes).append("\n");
            }
            else {
                sb.append(no).append("\n");
            }
        }
        System.out.println(sb);
    }
}