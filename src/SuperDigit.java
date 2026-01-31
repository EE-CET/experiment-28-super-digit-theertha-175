import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        sum *= k;

        while (sum >= 10) {
            long temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        System.out.print(sum);
        sc.close();
    }
}
