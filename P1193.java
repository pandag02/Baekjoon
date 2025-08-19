import java.util.Scanner;
public class P1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        int num = scan.nextInt();
        int upper = 1,  lower = 1, count =1;

        for(int i = 1; i < num ; i++){
            if(num == 1){
                break;
            }
            if(count % 2 == 0){
                lower++;
            } else {
                upper++;
            }

        }

        System.out.println(upper + "/" + lower);
    }
}
