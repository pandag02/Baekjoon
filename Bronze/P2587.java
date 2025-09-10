import java.util.Scanner;
import java.util.Arrays;

public class P2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
            total += n[i];
        }
        Arrays.sort(n);
        System.out.println(total / 5);
        System.out.println(n[2]);
    }
}