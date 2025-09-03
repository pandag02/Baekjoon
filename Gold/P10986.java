package Gold;
import java.util.Scanner;

public class P10986{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int divide = scan.nextInt();

        //int 형을 초과할 가능성이 있을 수도 있어서 long 타입 설정
        long[] array = new long[num+1];
        long[] dividearray = new long[divide];

        //구간합 배열을 만들고 이를 기반으로 나머지합을 만들기 위해 나눔 
        for(int i = 1; i<num+1; i++){
            array[i] = array[i-1] + scan.nextInt();
            int count =(int)(array[i]% divide);
            //구간합 이용시 필요. 모든 가능성에 대한 결과가 필요하기 때문
            dividearray[count]++;
        }

        //나머지가 0인 경우는 단일 나눗셈이 가능하여 기본적으로 더해줌
        long result = dividearray[0];
        
        //나머지가 같은 인덱스 중 2개를 뽑고 그에 맞는 경우의 수를 구함
        //2개를 택하는 모든 가능성에 대한 수식
        for(int i = 0; i < divide ; i++){
            if(dividearray[i] > 1){
                result = result + (long)(dividearray[i] * (dividearray[i] - 1 ) / 2);
            }
        }

        System.out.print(result);

    }
}