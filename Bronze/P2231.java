public class P2231 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int m = n-1;
        int result = Integer.MAX_VALUE;
  
        int count = 1;
        //최대 63까지 차가 날 수 있다.
        while(count < 63 && m > 0){
            int temp = m;
            int sum = 0;
            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            
            sum += m;
            if(sum == n){
                result = m;
            }
            count++;
            m--;
        }

        if(result == Integer.MAX_VALUE){
            result = 0;
        }

        System.out.println(result);
    }
}
