
public class P2501 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int count = 0;
        int result = 0;

        for(int i=1; i<=N; i++) {
            if(N % i == 0) {
                count++;
                if(count == K) {
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
