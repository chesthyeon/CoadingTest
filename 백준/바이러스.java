/// https://www.acmicpc.net/problem/2606
/// 바이러스

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int m = Integer.parseInt(br.readLine());
        boolean[][] computer = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            computer[x - 1][y - 1] = true;
            computer[y - 1][x - 1] = true;
        }
        bfs(computer, n);
    }
    public static void bfs(boolean[][] computer, int n) {
        int cnt = -1;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()) {
            int start = q.poll();
            cnt += 1;
            for (int i = 0; i < n; i++) {
                if (!computer[start][i] || visited[i]) {
                    continue;
                }
                visited[i] = true;
                q.add(i);
            }
        }
        System.out.println(cnt);
    }
}