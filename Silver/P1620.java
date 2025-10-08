import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] idxToName = new String[n + 1];        
        HashMap<String, Integer> nameToIdx = new HashMap<>(n * 2);

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            idxToName[i] = name;
            nameToIdx.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if (!q.isEmpty() && Character.isDigit(q.charAt(0))) {
                int idx = Integer.parseInt(q);
                sb.append(idxToName[idx]).append('\n');
            } else {                                             
                sb.append(nameToIdx.get(q)).append('\n');
            }
        }

        System.out.print(sb);
    }
}
