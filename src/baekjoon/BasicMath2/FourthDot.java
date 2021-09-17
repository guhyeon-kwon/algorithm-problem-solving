package baekjoon.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthDot {
    /*
    ※ 문제
    세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

    ※ 입력
    세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

    ※ 출력
    직사각형의 네 번째 점의 좌표를 출력한다.

    ※ 예제
    5 5
    5 7
    7 5
    기대값 => 7 7
     */

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] coord_1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};

        int x,y;

        if(coord_1[0] == coord_2[0] ){
            x = coord_3[0];
        } else if(coord_1[0] == coord_3[0]){
            x = coord_2[0];
        } else{
            x = coord_1[0];
        }

        if(coord_1[1] == coord_2[1] ){
            y = coord_3[1];
        } else if(coord_1[1] == coord_3[1]){
            y = coord_2[1];
        } else{
            y = coord_1[1];
        }

        System.out.println(x + " " + y);
    }
}
