/// https://www.acmicpc.net/problem/1002
/// 터렛
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        /// 테스트 케이스 만큼 반복
        while(t-- > 0){
            /// 터렛의 위치와 반지름을 입력받는다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            /// 두 터렛의 거리를 구한다.
            int d = (int)Math.pow(x1 - x2, 2) + (int)Math.pow(y1 - y2, 2);
            /// 두 터렛의 반지름을 합과 차를 구한다.
            int r = (int)Math.pow(r1 + r2, 2);
            int rm = (int)Math.pow(r1 - r2, 2);
            /// 두 터렛이 같은 위치에 있을 경우
            if(d == 0){
                if(r1 == r2){
                    System.out.println(-1);
                }else{
                    System.out.println(0);
                }/// 두 터렛이 같은 위치에 있지 않을 경우
            }else if(d == r || d == rm){
                System.out.println(1);
            }else if(d < r && d > rm){
                System.out.println(2);
            }else{
                System.out.println(0);
            }
        }
    }

}