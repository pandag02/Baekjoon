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
        //Arrays.sort(T[] array, Comparator<? super T> c)이 요구된다. 
        //여기서 Comparator가 있을 때, 반환이 음수(a가 b보다 작다), 0(같다), 양수(a가 b보다 크다)
        // 이렇게 결론이 나게 되어서 람다 식 안에서는 두 원소를 비교하는 함수가 나와야 한다. 
        // a는 배열의 i번째, b는 i+1번째 원소가 된다. 
        // 결과가 음수이면 a가 b보다 앞에 오도록 계산된다. 
        Arrays.sort(points, (a, b) -> {
            if(a[0] == b[0]) { //x좌표가 같을 때
                return a[1] - b[1]; //y좌표를 비교
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