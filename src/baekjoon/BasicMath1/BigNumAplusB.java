package baekjoon.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigNumAplusB {
    /*
    ※ 문제
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    ※ 입력
    첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

    ※ 출력
    첫째 줄에 A+B를 출력한다.

    ※ 예제
    9223372036854775807 9223372036854775808
    기대값 => 18446744073709551615
     */
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str_A = st.nextToken();
        String str_B = st.nextToken();

        int max_length = Math.max(str_A.length(), str_B.length());


        int[] A = new int[max_length + 1];
        int[] B = new int[max_length + 1];

        // A 초기화
        for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
            A[idx] = str_A.charAt(i) - '0';
        }

        // B 초기화
        for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
            B[idx] = str_B.charAt(i) - '0';
        }


        for(int i = 0; i < max_length; i++) {
            int value = A[i] + B[i];
            A[i] = value % 10;
            A[i + 1] += (value / 10);
        }

        StringBuilder sb = new StringBuilder();
        if(A[max_length] != 0) {
            sb.append(A[max_length]);
        }

        for(int i = max_length - 1; i >= 0; i--) {
            sb.append(A[i]);
        }
        System.out.println(sb);
    }
}
