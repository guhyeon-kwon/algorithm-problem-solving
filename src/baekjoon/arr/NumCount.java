package baekjoon.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumCount {
    /*
    ※ 문제
    세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
    예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
    계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
    ※ 입력
    첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

    ※ 출력
    첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
    1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

    ※ 예제
    150
    266
    427
    기대값 =>
            3
            1
            0
            2
            0
            0
            0
            2
            0
            0

     */

    /*
    1. A * B * C 의 계산 결과를 변수에 담는다.
    2. 크기가 10인 int 배열을 만든다.
    3. 배열의 인덱스는 각 정수값을 의미한다.
    4. 계산 결과값을 for문을 돌며 charAt으로 하나씩 뺀다.
    5. 배열[뺀값] = 배열[뺀값] + 1로 저장한다.
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        String multiply = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));

        for(int i=0; i<multiply.length(); i++){
            char s = multiply.charAt(i);
            // char를 int로 바꾸면 해당 문자의 아스키값으로 변하므로 문자 - '0'을 하여 진짜 숫자로 바꿔줘야 한다.
            // Character.getNumericValue(값) 으로도 가능하다
            int arrNum = s - '0';
            arr[arrNum] = arr[arrNum] + 1;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
