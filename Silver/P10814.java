import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P10814{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arrays = new String[n][2];

        for(int i = 0; i < n; i++){
            String line = br.readLine(); 
            String[] input = line.split(" ").split();
            arrays[i][0] = input[0];
            arrays[i][1] = input[1];
        }

        // String을 Int 형식으로 변경해서 비교를 진행. 
        Arrays.sort(arrays, (a, b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);
            return Integer.compare(ageA, ageB);
        });

        StringBuilder output = new StringBuilder();
        for(int i = 0; i < n; i ++){
            output.append(arrays[i][0]).append(" ").append(arrays[i][1]).append("\n");
        }

        System.out.print(output);
    }
}
