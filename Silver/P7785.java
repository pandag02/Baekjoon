import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class P7785{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hash = new HashMap<>();

        for(int i = 0;i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            hash.put(name, status);
            

        }

        Map<String, String> byKey = new TreeMap<>(Collections.reverseOrder());
        byKey.putAll(hash);

        StringBuilder sb = new StringBuilder();
        for(String k : byKey.keySet()){
            if("enter".equals(byKey.get(k))){
                sb.append(k).append("\n");
            }
        }
        System.out.print(sb);

    }
}