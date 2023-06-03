/// https://www.acmicpc.net/problem/1931
/// 회의실 배정
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int t = Integer.parseInt(br.readLine());
        /// 회의 일정을 저장하기 위한 리스트
        List<Pair> pairs = new ArrayList<>();
        // 최소 하나의 회의실은 예약하므로 1
        int ans = 1;
        /// 회의 시간을 리스트에 추가
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            pairs.add(new Pair(start, end));
        }
        /// 회의가 끝나는 시간순으로 정렬, 만약 끝나는 시간이 갔다면 시작 시간 순으로 정렬
        pairs.sort((o1, o2) -> {
            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });
        /// 첫 회의가 끝나는 시간을 저장
        int end = pairs.get(0).end;
        /// 두번째 회의부터 반복
        for (int i = 1; i < t; i++) {
            if(end <= pairs.get(i).start){
                end = pairs.get(i).end;
                ans++;
            }
        }
        System.out.println(ans);
    }
    static class Pair{
        final int start;
        final int end;
        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}