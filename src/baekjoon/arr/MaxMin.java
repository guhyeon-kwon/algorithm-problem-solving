package baekjoon.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
    /*
    ※ 문제
    N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

    ※ 출력
    첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

    ※ 예제
    5
    20 10 35 30 7
    기대값 => 7 35
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int firstNum = Integer.parseInt(st.nextToken());
        int max=firstNum, min=firstNum;

        // 앞에서 하나 뺏으니 N-1해야함
        for(int i=0; i<N-1; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(max < temp){
                max = temp;
            }

            if(min > temp){
                min = temp;
            }
        }

        System.out.println(min + " " + max);
    }
}
