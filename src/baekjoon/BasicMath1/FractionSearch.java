package baekjoon.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionSearch {
    /*
    ※ 문제
    무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

    ※ 출력
    첫째 줄에 분수를 출력한다.

    ※ 예제
    1
    기대값 => 1/1
     */

    /*
    짝이면(T%2가 0일때) 위에서 내려옴(행을 올리고 열을 내리면서)
    홀이면(T%2가 1일때) 아래에서 올라옴(행을 줄이고 열을 올리면서)

    분자와 분모의 합을 T
    대각선 칸의 개수를 T-1
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_cross_sum = 0;

        while(true){
            if(X <= cross_count + prev_cross_sum){
                if(cross_count % 2 == 1){
                    System.out.println((cross_count - (X - prev_cross_sum - 1)) + "/" + (X - prev_cross_sum));
                    break;
                } else{
                    System.out.println((X - prev_cross_sum) + "/" + (cross_count - (X - prev_cross_sum - 1)));
                    break;
                }
            } else{
                prev_cross_sum += cross_count;
                cross_count++;
            }
        }
    }
}
