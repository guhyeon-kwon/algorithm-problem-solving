package baekjoon.forQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
    /*
    ※ 문제
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    ※ 입력
    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

    ※ 출력
    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

    ※ 예제
    5
    기대값 =>
            *
           **
          ***
         ****
        *****
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }

            for(int f=0; f<=i; f++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
