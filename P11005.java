import java.util.Scanner;

public class P11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int base = scan.nextInt();

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char) ('A' + remainder - 10));
            }
            number /= base;
        }

        // 결과를 뒤집어서 출력
        System.out.println(result.reverse().toString());
    }
}
