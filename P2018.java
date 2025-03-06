import java.util.Scanner;

public class P2018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result = 1; // 자기 자신 하나로도 표현 가능하므로 1로 초기화

        int start = 1, end = 1, sum = 1;

        while (end != num) {
            if (sum == num) {
                result++;
                end++;
                sum += end;
            } else if (sum > num) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }

        System.out.print(result);
    }
}
