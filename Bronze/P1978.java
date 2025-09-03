public class P1978 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        for(int i =0; i<N; i++) {
            int num = scan.nextInt();
            for(int j=1; j<num; j++) {
                if(num % j == 0) {
                    sum += j;
                }
            }
            
        }
        System.out.println(sum);
    }
}
