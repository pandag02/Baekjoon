public class P9063 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N = scan.nextInt();

        int minX = 10000;
        int maxX = -10000;
        int minY = 10000;
        int maxY = -10000;

        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x < minX) {
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if (y < minY) {
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
