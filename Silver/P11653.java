public class P11653 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();
        for(int i=2; i<=N; i++) {
            while(N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
    }
}
