/// https://www.acmicpc.net/problem/4673
/// 셀프 넘버
public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10000; i++){
            int n = i;
            int temp = i;
            while (temp > 0){
                n += temp % 10;
                temp /= 10;
            }
            if (n < 10001){
                arr[n] = true;
            }
            if(!arr[i]){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}