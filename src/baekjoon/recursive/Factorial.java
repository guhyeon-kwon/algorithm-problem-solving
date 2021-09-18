package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    /*
    ※ 문제
    0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

    ※ 출력
    첫째 줄에 N!을 출력한다.

    ※ 예제
    10
    기대값 => 3628800
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    public static int factorial(int N){
        if(N == 0){
            return 1;
        } else{
            return N * factorial(N-1);
        }
    }
}