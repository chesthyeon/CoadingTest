/// https://www.acmicpc.net/problem/1463
/// 1로 만들기
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
            if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }
        }
        System.out.println(arr[n]);
    }
}