import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 1;
        for (int i =1; i<= n/2; i++){
            if (n % i == 0)
                count++;
            if (count>2)
                break;
        }
        if (count == 2) System.out.println("Prime Number");
        else System.out.println("Not a prime Number");
    }
}
