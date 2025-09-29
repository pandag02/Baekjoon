// 첫 번째와 두 번째에서 받아온 배열 2개의 같은게 있는지 비교하는 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashSet;
import java.util.StringTokenizer;

public class P10815{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            set.add(Integer.parseInt(st1.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; i++){
            int x = Integer.parseInt(st2.nextToken());
            sb.append(set.contains(x) ? 1 : 0).append(" ");
        }
        System.out.println(sb);

    }
}