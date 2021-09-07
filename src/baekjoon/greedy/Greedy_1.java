package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_1 {
    /*
    ※ 문제
    준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
    둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

    ※ 출력
    첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

     */

    public static void greedy() throws IOException {

        // 값 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 줄 읽어와서 " " 기준으로 쪼개서 가져옴
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 동전의 종류 갯수
        int N = Integer.parseInt(st.nextToken());
        // 가치의 합
        int K = Integer.parseInt(st.nextToken());

        // 동전 종류 갯수만큼 배열 공간 확보
        int[] coin = new int[N];

        // 동전 종류 갯수만큼 for문 돌면서 코인 리스트에 동전의 가치 입력
        for(int i = 0; i  < N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        // 결과로 출력할 동전 개수
        int count = 0;

        // 동전의 가치가 오름차순으로 주어지므로 뒤에서 부터 가져옴
        for(int i = N - 1; i >= 0; i--) {
            // 동전의 가치가 가치의 합보다 작아야함
            if(coin[i] <= K) {
                count += (K / coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
