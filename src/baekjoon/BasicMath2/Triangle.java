package baekjoon.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
    /*
    ※ 문제
    과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

    ※ 입력
    입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며,
    각 입력은 변의 길이를 의미한다.

    ※ 출력
    각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

    ※ 예제
    6 8 10
    25 52 60
    5 12 13
    0 0 0
    기대값 => right
            wrong
            right
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num_1 = Integer.parseInt(st.nextToken());
            int num_2 = Integer.parseInt(st.nextToken());
            int num_3 = Integer.parseInt(st.nextToken());

            if(num_1 == 0 && num_2 == 0 && num_3 == 0){
                break;
            }

            int sum = num_1 * num_1 + num_2 * num_2;

            if(sum == num_3*num_3){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}
