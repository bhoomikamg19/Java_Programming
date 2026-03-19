import java.util.Scanner;

public class Check_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int a = sc.nextInt();
        if (a >= -9 && a<= 9)
            System.out.println("Single digit");
        else System.out.println("Number");
    }
}
