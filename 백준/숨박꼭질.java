/// https://www.acmicpc.net/problem/1697
/// 숨바꼭질
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /// 수빈이 위치
        int n = Integer.parseInt(st.nextToken());
        /// 동생 위치
        int k = Integer.parseInt(st.nextToken());
        /// 수빈이 현재 위치를 큐에 넣는다.
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(n,0));
        /// 수빈이가 방문한 지점
        boolean[] visited = new boolean[100001];
        visited[n] = true;
        /// 동생 찾기 시작
        while (!queue.isEmpty()) {
            /// 수빈이의 현재 위치를 저장
            Pair p  = queue.poll();
            // 동생을 찾았다면 출력후 종료힌다.
            if (p.cur == k) {
                System.out.println(p.dis);
                return;
            }
            /// -1, 1, * 2 거리 만큼 이동한다.
            if (p.cur - 1 >= 0 && !visited[p.cur - 1]) {
                visited[p.cur - 1] = true;
                queue.add(new Pair(p.cur - 1, p.dis + 1));
            }
            if (p.cur + 1 <= 100000 && !visited[p.cur + 1]) {
                visited[p.cur + 1] = true;
                queue.add(new Pair(p.cur + 1, p.dis + 1));
            }
            if (p.cur * 2 <= 100000 && !visited[p.cur * 2]) {
                visited[p.cur * 2] = true;
                queue.add(new Pair(p.cur * 2, p.dis + 1));
            }
        }
    }

    static class Pair {
        int cur;
        int dis;
        public Pair(int cur, int dis){
            this.cur = cur;
            this.dis = dis;
        }
    }
}