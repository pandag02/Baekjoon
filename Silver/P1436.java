import java.util.*;

public class P1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 666; i <= 10000000; i++) {
            if (String.valueOf(i).contains("666")) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                break;
            }
        }   
        
    }
}