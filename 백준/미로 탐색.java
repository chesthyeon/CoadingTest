/// https://www.acmicpc.net/problem/2178
/// 미로 탐색

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /// 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        /// 지도 그리기
        for (int i = 0; i < n; i++) {
            int idx = 0;
            for (char c : br.readLine().toCharArray()) {
                map[i][idx++] = c - '0';
            }
        }
        /// bfs
        System.out.println(bfs(n, m ,map));
    }
    static public int bfs(int n, int m, int[][] map){
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int nx, ny;
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(0, 0, 1));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            if (p.x == n - 1 && p.y == m - 1) {
                return p.cnt;
            }
            for (int i = 0; i < 4; i++) {
                nx = p.x + dx[i];
                ny = p.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || map[nx][ny] == 0) {
                    continue;
                }
                q.offer(new Pair(nx, ny, p.cnt + 1));
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
    static class Pair{
        final int x;
        final int y;
        final int cnt;

        public Pair(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}