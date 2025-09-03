import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int max = 0;
        
        int[] array = new int[num];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
            //바로 비교해서 최대값 찾기
            if(max < array[i]){
                max = array[i];
            }
        }

        double avg=0;
        //수식 계산 및 평균 구하기 위한 덧셈, 이때 형변환이 필요하다.
        for(int i = 0; i< array.length; i++){
            avg = avg + (double)array[i] / max * 100;
        }

        avg = avg / array.length;
        
        System.out.print(avg);
    }
}


// 총합에 수식을 계산하는 것으로 수정하면 더 간결하게 풀 수 있다. 
