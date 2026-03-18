import java.util.Scanner;

public class Biggest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b)
            System.out.println("B is bigger");
        else
            System.out.println("A is greater");
    }
}
