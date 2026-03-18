import java.util.Scanner;

public class Biggest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a, b and c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big = a;
        if (b > big)
            big = b;
        else
            big = c;
        System.out.println(big + " is greatest");

    }
}
