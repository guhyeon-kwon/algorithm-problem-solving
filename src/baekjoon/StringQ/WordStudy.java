package baekjoon.StringQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordStudy {
    /*
    ※ 문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
    단, 대문자와 소문자를 구분하지 않는다.

    ※ 입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    ※ 출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
    단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    ※ 예제
    Mississipi
    기대값 => ?
    zZa
    기대값 => Z
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        char[] alphabet = new char[26];

        int result_count = 0;
        String result = "";

        String S = br.readLine().toLowerCase();

        if(S.length() < 2){
            System.out.println(S);
            return;
        }

        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            arr[ch - 'a'] = arr[ch - 'a'] + 1;
            alphabet[ch - 'a'] = ch;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > result_count){
                result_count = arr[i];
                result = String.valueOf(alphabet[i]);
            } else if (arr[i] != 0 && arr[i] == result_count) {
                System.out.println("?");
                return;
            }
        }

        System.out.println(result.toUpperCase());
    }
}
