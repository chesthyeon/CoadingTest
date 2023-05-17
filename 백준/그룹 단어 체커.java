/// https://www.acmicpc.net/problem/1316
/// 그룹 단어 체커
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            boolean[] alpha_arr = new boolean[26];
            char[] word = br.readLine().toCharArray();
            char pre_alpha = word[0];
            alpha_arr[pre_alpha - 'a'] = true;
            for (int j = 1; j < word.length; j++) {
                int idx = word[j] - 'a';
                if (alpha_arr[idx] && word[j] != pre_alpha) {
                    ans -= 1;
                    break;
                }
                alpha_arr[idx] = true;
                pre_alpha = word[j];
            }
            ans += 1;
        }
        System.out.println(ans);
    }
}