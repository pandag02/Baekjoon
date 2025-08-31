public class P1085 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        
        int min1 = Math.min(x, w - x);
        int min2 = Math.min(y, h - y);
        System.out.println(Math.min(min1, min2));
    }
}
