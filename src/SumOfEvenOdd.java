import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int oddsum = 0, evensum = 0;
        while (n != 0){
            int ld = n % 10;
            if (ld % 2 != 0)
                oddsum = oddsum + ld;
            else evensum = evensum + ld;
            n = n / 10;
        }
        System.out.println("Odd sum: " + oddsum);
        System.out.println("Even sum: " + evensum);
    }
}
