import java.util.Scanner;

public class SumOfDigitsInNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int res = calculateSum(n);
        System.out.println(res);
    }

    static int calculateSum(int n){
        int sum = 0;
        while (n != 0){
            int ld = n % 10;
            sum = sum + ld;
            n /= 10;
        }
        return sum;
    }
}
