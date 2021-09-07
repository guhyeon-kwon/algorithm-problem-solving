package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy_2 {
    /*
    ※ 문제
    한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
    각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
    단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
    회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

    ※ 입력
    첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고
    회의의 시작시간과 끝나는 시간이 주어진다. 시작 시간과 끝나는 시간은 231-1보다 작거나 같은 자연수 또는 0이다.

    ※ 출력
    첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.
     */

    public static void greedy() throws IOException {
        /*
        1. 종료시간을 기준으로 정렬한다.
        2. 이전 종료시간과 겹치지 않을 경우 직전 종료시간을 갱신하고 카운트를 늘린다.
         */
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 첫번째 줄은 전체 회의의 수 이므로 N은 전체 회의 수

        int[][] time = new int[N][2];

        for(int i = 0; i < N; i++){
            time[i][0] = in.nextInt(); // 시작시간
            time[i][1] = in.nextInt(); // 종료시간
        }

        // 1.
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같을경우 시작시간이 빠른 순으로 정렬
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // 결과값
        int count = 0;
        // 직전 종료시간
        int prev_end_time = 0;

        // 2.
        for(int i = 0; i < N; i++){
            // 직전 종료시간이 시작시간보다 작거나 같을경우 직전 종료시간을 갱신하고 카운트를 늘린다
            if(prev_end_time <= time[i][0]){
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
