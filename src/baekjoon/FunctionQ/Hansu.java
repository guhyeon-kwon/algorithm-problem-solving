package baekjoon.FunctionQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansu {
    /*
    ※ 문제
    어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
    N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

    ※ 출력
    첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

    ※ 예제
    110
    기대값 => 99
     */

    /*
    1. 1-99는 전부 한수다. 그러므로 3자리 수 미만의 수는 수만큼 한수가 있다. 3자리 수 이상부터 계산한다.
    */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N < 100){
            System.out.println(N);
            return;
        }

        int count = 99;

        for(int i=100; i<=N; i++){
            if(hansu(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean hansu(int num) {
        int gap = (int)String.valueOf(num).charAt(0) - (int)String.valueOf(num).charAt(1);
        for (int i=2; i<String.valueOf(num).length(); i++){
            if((int)String.valueOf(num).charAt(i-1) - (int)String.valueOf(num).charAt(i) != gap){
                return false;
            }
        }
        return true;
    }


}
