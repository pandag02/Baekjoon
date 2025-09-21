import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// 문제에서 요구되는 사항은 각 배열보다 작은 것이 몇개나 있는지 출력하는 것이다. 
// 이떄 중복되는 숫자는 1개로 취급한다. 

public class P18870 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] arr = new int[n];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
            num[i] = arr[i];
        }

        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int x : arr) {
            if (!map.containsKey(x)) {
                map.put(x, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(num[i])).append(" ");
        }

        System.out.print(sb);
    }
}