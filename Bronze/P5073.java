public class P5073 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
