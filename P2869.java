import java.util.Scanner;

// 그냥 문제를 반복문으로 풀게 되면 시간초과가 뜨게 된다. 
// 수학적으로 접근해야 한다. 
// (V - A) / (A - B) + 1 을 하면 된다.
// (V - A) : 마지막날에 A만큼 올라가면 되기 때문에
// (A - B) : 하루에 올라가는 높이
// + 1 : 마지막날 하루를 더해주기 위해서
// Math.ceil : 올림을 해주는 함수

public class P2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();
        int day = (int) Math.ceil(( (double)(V - A) / (double)(A - B) )) + 1;

        System.out.println(day);
    }
}
