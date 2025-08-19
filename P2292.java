import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int current = 6;
        int total = 2;
        int count = 1;

        while(num >= total) {
            total += current;
            current += 6;
            count++;
        }
        
        System.out.println(count);
    }
}
