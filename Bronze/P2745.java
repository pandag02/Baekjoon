import java.util.Scanner;

public class P2745 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int base = scan.nextInt();

        int total = 0;

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int value;

            if (Character.isDigit(c)) {
                value = c - '0'; // 숫자 0-9
            } else {
                value = Character.toUpperCase(c) - 'A' + 10; // 문자 A-Z
            }

            total += value * Math.pow(base, input.length() - 1 - i);


        }

        System.out.println(total);

    }    

}
