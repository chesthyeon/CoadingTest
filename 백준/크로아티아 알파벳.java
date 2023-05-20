/// https://www.acmicpc.net/problem/2941
/// 크로아티아 알파벳
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alpha = br.readLine().toCharArray();
        /// 크로아티아 문자를 저장
        HashSet<String> croatia_alpha_map = new HashSet<>();
        croatia_alpha_map.add("c=");
        croatia_alpha_map.add("c-");
        croatia_alpha_map.add("dz=");
        croatia_alpha_map.add("d-");
        croatia_alpha_map.add("lj");
        croatia_alpha_map.add("nj");
        croatia_alpha_map.add("s=");
        croatia_alpha_map.add("z=");
        /// 크로아티아 없다면 답은 문자열의 길이다.
        int ans = alpha.length;
        /// 문자열 탐색
        for (int i = 0; i < alpha.length - 1; i++) {
            /// 두글자가 크로아티아 문자라면 ans - 1
            String s1 = String.valueOf(alpha, i, 2);
            if (croatia_alpha_map.contains(s1)) {
                ans -= 1;
            }
            /// 세글자가 크로아티아 문자라면 ans - 1, dz=, z= 는 겹치므로 총 -2가 수행됨
            if (i < alpha.length - 2) {
                String s2 = String.valueOf(alpha, i, 3);
                ans = croatia_alpha_map.contains(s2) ? ans - 1: ans;
            }
        }
        System.out.println(ans);
    }
}