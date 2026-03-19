import java.util.Scanner;

public class Check_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        String s = "Non-zero";
        if (a == 0)
            s = "Zero";
        System.out.println(s);
    }
}
