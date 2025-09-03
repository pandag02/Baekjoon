import java.util.Scanner;

public class P11720{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //입력을 받아오게 됨.
        int num = scan.nextInt();
        String sNum = scan.next();

        char[] array = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + (array[i] - '0');
        }
        
        System.out.print(sum);

    }
}