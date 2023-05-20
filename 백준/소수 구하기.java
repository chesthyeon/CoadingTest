/// https://www.acmicpc.net/problem/1929
/// 소수 구하기

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int m = Integer.parseInt(st.nextToken());
        final int n = Integer.parseInt(st.nextToken());
        /// 에라토스테네스의 체 알고리즘을 사용하기 소수 체크 배열
        boolean[] check_prime = new boolean[n + 1];
        /// 1은 소수가 아니다.
        check_prime[1] = true;
        /// m <= x <= n인 수를 저장하기위한 리스트
        List<Integer> prime_numbers = new ArrayList<>();
        /// 리스트 값을 출력하기위한 스트링 빌더
        StringBuilder sb = new StringBuilder();
        /// 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (!check_prime[i]) {
                for (int j = i + i; j <= n; j += i) {
                    check_prime[j] = true;
                }
            }
        }
        /// 소수라면 리스트에 추가
        for (int i = m; i <= n; i++) {
            if (!check_prime[i]) {
                prime_numbers.add(i);
            }
        }
        /// 출력
        prime_numbers.forEach(value -> sb.append(value).append("\n"));
        System.out.println(sb);
    }
}