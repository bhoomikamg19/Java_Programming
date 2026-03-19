import java.util.Scanner;

public class Check_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
            System.out.println("Equal");
        System.out.println("Not equal");
    }
}
