import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(points, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }

        System.out.print(sb);
    }
}