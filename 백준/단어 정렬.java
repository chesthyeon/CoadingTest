/// hhttps://www.acmicpc.net/problem/1181
/// 단어 정렬

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        TreeSet<String> words = new TreeSet<>(((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length()));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }
        words.forEach((String value) -> sb.append(value).append("\n"));
        System.out.println(sb);
    }
}