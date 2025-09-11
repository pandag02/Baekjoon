import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class P10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[10001];
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}