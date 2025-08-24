import java.util.Scanner;
// 원래 문제를 푸는 방식은 아래와 같지만 처음 풀어볼 때는 이렇게 풀어보았습니다. 
//1, 2, 3, … 번째 대각선에는 각각 1, 2, 3, … 개의 원소가 있습니다.
// 대각선 k까지의 누적 개수 = k(k+1)/2.
// X가 주어지면 k(k+1)/2 ≥ X를 만족하는 최소 k를 찾고, 이전 누적 (k-1)k/2를 빼서 대각선 내 오프셋을 구합니다.
// 대각선 번호 k가 홀수면 “위에서 아래로” 진행(분자가 감소), 짝수면 “아래에서 위로”(분자가 증가)
public class P1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int number = 1, count = 0;
        int currentL = 1, currentU = 1;

        for (int i = 1; i < num; i++) {

            if (num == 1) {
                break;
            }
            // 분모가 증가할 때
            if (count % 4 == 0) {
                number++;
                currentL = number;
                count++;
            // 분자가 증가할 때
            } else if (count % 4 == 2) {
                number++;
                currentU = number;
                count++;
            } else {       
                if (count % 4 == 1) {
                    currentL--;
                    currentU++;
                    if(currentL == 1){
                        count++;
                    }
                } else if (count % 4 == 3) {
                    currentL++;
                    currentU--;
                    if(currentU == 1){
                        count++;
                    }
                }
            }
        }

        System.out.println(currentU + "/" + currentL);
    }
}
