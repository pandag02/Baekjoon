public class P14215 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        if(first < second) {
            int temp = first;
            first = second;
            second = temp;
        }
        if(first < third) {
            int temp = first;
            first = third;
            third = temp;
        }

        if( second + third > first) {
            System.out.println(first + second + third);
            return;
        }

        System.out.println((second + third) * 2 - 1);
    }
}
