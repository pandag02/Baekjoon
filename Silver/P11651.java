import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P11651{
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];

        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(arr,(a, b)-> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        StringBuilder sd = new StringBuilder();
        for(int i = 0; i < num; i++){
            sd.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.print(sd);

    }
}