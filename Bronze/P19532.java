public class P19532 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        for(int x=-999; x<=999; x++){
            for(int y=-999; y<=999; y++){
                if(a*x + b*y == c && d*x + e*y == f){
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
