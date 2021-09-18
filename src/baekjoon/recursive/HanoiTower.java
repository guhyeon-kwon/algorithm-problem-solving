package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {
    /*
    ※ 문제
    세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

    1.한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
    2.쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.

    이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
    아래 그림은 원판이 5개인 경우의 예시이다.

    ※ 입력
    첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.

    ※ 출력
    첫째 줄에 옮긴 횟수 K를 출력한다.
    두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
    이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.

    ※ 예제
    3
    기대값 =>
    7
    1 3
    1 2
    3 2
    1 3
    2 1
    2 3
    1 3
     */

    public static StringBuilder sb = new StringBuilder();

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 하노이탑 옮긴 횟수 공식 2의n승-1 (n : 원판수)
        sb.append((int) (Math.pow(2, N) - 1)).append("\n");

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    
    /*
        N : 원판의 개수
        start : 출발지
        mid : 옮기기 위해 이동해야 하는 장소
        to : 목적지
     */
    public static void Hanoi(int N, int start, int mid, int to){
        // 이동할 원반의 수가 1개라면?
        if(N == 1){
            sb.append(start + " " + to + "\n");
            return;
        }

        // N-1개를 A에서 B로 이동
        Hanoi(N - 1, start, to, mid);

        // 남은 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // N-1개를 B에서 C로 이동
        Hanoi(N-1, mid, start, to);
    }


}
