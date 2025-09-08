import java.util.*;

public class P1018 {
    static int countRepaint(char[][] board, int r, int c) {
        // 좌상단이 'W'인 체스판으로 만들 때 필요한 칠하기 수
        int repaintW = 0;
        // 좌상단이 'B'인 체스판으로 만들 때 필요한 칠하기 수
        int repaintB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char cur = board[r + i][c + j];
                // (i + j)가 짝수면 좌상단과 같은 색, 홀수면 반대 색이어야 함
                if ((i + j) % 2 == 0) {
                    if (cur != 'W') repaintW++; // W시작 기준 불일치
                    if (cur != 'B') repaintB++; // B시작 기준 불일치
                } else {
                    if (cur != 'B') repaintW++;
                    if (cur != 'W') repaintB++;
                }
            }
        }
        return Math.min(repaintW, repaintB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            board[i] = line.toCharArray();
        }

        int ans = Integer.MAX_VALUE;
        for (int r = 0; r <= n - 8; r++) {
            for (int c = 0; c <= m - 8; c++) {
                ans = Math.min(ans, countRepaint(board, r, c));
            }
        }
        System.out.println(ans);
    }
}
