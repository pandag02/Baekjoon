public class P2798 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    if (arr[i] + arr[j] + arr[l] > total && k >= arr[i] + arr[j] + arr[l]) {
                        total = arr[i] + arr[j] + arr[l];
                    }
                }
            }
        }

        System.out.println(total);
    }
}
