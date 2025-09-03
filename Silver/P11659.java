
import java.util.Scanner;

public class P11659 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arraynum = scan.nextInt();
        int[] array = new int[arraynum+1];
        int querynum = scan.nextInt();
        
        array[0] = 0;

        for(int i = 1; i<arraynum+1; i++){
            array[i] = 0;
            array[i] = array[i-1] + scan.nextInt();
        }

        for(int i = 0; i < querynum; i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            System.out.println(array[end] - array[start-1]);
        }


    }
}
