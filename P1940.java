import java.util.Scanner;
//import java.util.Arrays; -> array.sort() 사용해서 풀이해도 됨.
public class P1940{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraynum = scan.nextInt();
        int total = scan.nextInt();

        int[] array = new int[arraynum];
        int[] temparray = new int[arraynum];
        for(int i = 0; i < arraynum; i++){
            array[i] = scan.nextInt();
        }
        //데이터 정렬(merge sort)
        mergeSort(array, temparray, 0, arraynum - 1);
        
        int start=0, end = arraynum - 1, sum = 0;
        int result = 0;
        // 두 포인터가 서로 교차하기 전까지 반복
        while (start < end) {
            sum = array[start] + array[end]; //2개의 자원만 요구됨으로 덧셈
            
            if (sum == total) { //힌킨씩 양쪽 다 당김
                result++;
                start++;
                end--;
            } else if (sum < total) {
                start++;
            } else { // sum > total
                end--;
            }
        }
        System.out.print(result);

    }

    public static void mergeSort(int[] arr, int[] tmpArr, int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;
            mergeSort(arr, tmpArr, left, m);
            mergeSort(arr, tmpArr, m + 1, right);
            merge(arr, tmpArr, left, m, right);
        }
    }
    public static void merge(int[] arr, int[] tmpArr, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tmpArr[i] = arr[i];
        }
        int part1 = left;
        int part2 = mid + 1;
        int index = left;
        while (part1 <= mid && part2 <= right) {
            if (tmpArr[part1] <= tmpArr[part2]) {
                arr[index] = tmpArr[part1];
                part1++;
            } else {
                arr[index] = tmpArr[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmpArr[part1 + i];
        }
    }
}

