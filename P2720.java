import java.util.Scanner;

public class P2720 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[] coins = {25, 10, 5, 1};
        int[][] coinsCounts = new int[num][coins.length];

        
        for (int i = 0; i < num; i++) {
            int change = scan.nextInt();
            for(int j= 0; j < coins.length; j++) {
                coinsCounts[i][j] = change / coins[j]; 
                change %= coins[j];
            }   
        }

        for(int i = 0; i < num; i++) {
            System.out.printf("%d %d %d %d\n", coinsCounts[i][0], coinsCounts[i][1], coinsCounts[i][2], coinsCounts[i][3]);
        }
    }
}
