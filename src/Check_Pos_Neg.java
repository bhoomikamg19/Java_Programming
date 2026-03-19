import java.util.Scanner;

public class Check_Pos_Neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        String s = "Positive";
        if (a<0)
            s = "Negative";
        System.out.println(s);
    }
}
