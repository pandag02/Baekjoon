import java.util.Scanner;

public class P11660{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arraynum = scan.nextInt();
        int querynum = scan.nextInt();

        int[][] array = new int[arraynum+1][arraynum+1];
        
        //기본 배열 만들기
        for(int i = 1; i < arraynum+1; i++){
            for(int j = 1; j < arraynum+1; j++){
                array[i][j] = scan.nextInt();
            }
        }

        //구간합 배열 만들기 
        for (int i = 1; i < arraynum+1; i++) {
            for(int j = 1; j < arraynum+1; j++){
                array[i][j] = array[i][j] + array[i-1][j] + array[i][j-1] - array[i-1][j-1];
                //System.out.print(array[i][j] + " ");
            }
            //System.out.println();
        }

        //구간합 결과 출력
        for( int i = 0; i < querynum; i++){
            int x1 = scan.nextInt() ;
            int y1 = scan.nextInt() ;
            int x2 = scan.nextInt() ;
            int y2 = scan.nextInt() ;
            int sum = 0;

            sum = array[x2][y2] - array[x1-1][y2] - array[x2][y1-1] + array[x1-1][y1-1];

            System.out.println(sum);
        }
    }
}