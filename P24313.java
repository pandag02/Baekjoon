public class P24313 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        int result =0; 
        if(a1 * n0 + a0 <= c * n0 && a1 <= c) {
            result = 1;
        }

        System.out.println(result);
    }
}
