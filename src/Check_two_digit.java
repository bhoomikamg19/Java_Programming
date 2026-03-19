import java.util.Scanner;

public class Check_two_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int a = sc.nextInt();
        if (a >= 10 && a<= 99)
            System.out.println("Number");
        else System.out.println("Single digit");
    }
}
