import java.util.Scanner;

public class Gcd_No {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        if (a > b)
                gcd(a - b, b);
        else
                gcd(b - a, a);
        if(a == 0)
            return b;
        return 0;
    }
}
