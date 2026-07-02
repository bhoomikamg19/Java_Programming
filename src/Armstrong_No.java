import java.util.Scanner;

public class Armstrong_No {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean rs = isArmStrong(n);
        if (rs)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }

    private static boolean isArmStrong(int n) {
        int no = n,num = n;
        int count =0;
        while(num != 0){
            count++;
            num = num / 10;
        }
        int res=0;
        while(n > 0){
            int ld = n % 10;
            res = res + (int)Math.pow(ld,count);
            n = n/ 10;
        }

        return res == no;
    }
}
