package baekjoon.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decimal {
    /*
    ※ 문제
    주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

    ※ 입력
    첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

    ※ 출력
    주어진 수들 중 소수의 개수를 출력한다.

    ※ 예제
    4
    1 3 5 7
    기대값 => 3
     */
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;

        for (int i=0; i<N; i++){
            boolean check = true;
            int num = Integer.parseInt(st.nextToken());
            if (num == 1){
                continue;
            }
            for(int j=2; j*j<=num; j++){
                if(num % j == 0){
                    check = false;
                }
            }
            if(check == true){
                count++;
            }
        }

        System.out.println(count);
    }
}
