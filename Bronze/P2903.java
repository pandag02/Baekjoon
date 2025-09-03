import java.util.Scanner;

// 중앙 이동 알고리즘이라고 나오지만 규칙 찾기 문제입니다. 
// 상자의 라인과 점이 동일하게 증가하고 그 수가 입력 값의 +1 임이 보입니다.
public class P2903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int result = (int) Math.pow(2, num) + 1;

        System.out.println(result * result);
    }
}
