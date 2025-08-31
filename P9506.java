public class P9506 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        while(true) {
            int N = scan.nextInt();
            if(N == -1) break;
            int sum = 0;
            String sb = "";
            for(int i=1; i<N; i++) {
                if(N % i == 0) {
                    sum += i;
                    sb += i + " + ";
                }
            }
            if(sum == N) {
                sb = sb.substring(0, sb.length() - 3);
                System.out.println(N + " = " + sb.toString());
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
