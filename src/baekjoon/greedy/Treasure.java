package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Treasure {
    static int[] A;
    static int[] B;

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        A = new int[N];
        B = new int[N];

        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int j=0; j<N; j++){
            A[j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int j=0; j<N; j++){
            B[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for (int i=0; i<N; i++){
            int maxIndex = max(B);

            result += A[i] * B[maxIndex];

            B = remove(B, maxIndex);
        }

        System.out.println(result);

    }

    private static int max(int[] arr){
        int maxIndex = 0;

        for (int i=1; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static int[] remove(int[] arr, int index){
        int[] newArr = new int[arr.length - 1];

        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - (index + 1));

        return newArr;
    }


}
