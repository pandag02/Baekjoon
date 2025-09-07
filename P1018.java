import java.util.Scanner;
public class P1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            board[i] = line.toCharArray();
        }

        int changeCount = 0;
        for (int i = 0; i < n; i++) {          
            for (int j = 0; j < m-1; j++) {
                if(i != 0 && j==0 && board[i][j] == board[i-1][j]){
                    changeCount++;
                    board[i][j] = board[i][j] == 'B' ? 'W' : 'B';
                    j--;
                }else if(j != 0 && board[i][j] == board[i][j+1]){
                    changeCount++;
                    board[i][j+1] = board[i][j+1] == 'B' ? 'W' : 'B';
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {          
            for (int j = 0; j < m-1; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(changeCount);
    }
}
