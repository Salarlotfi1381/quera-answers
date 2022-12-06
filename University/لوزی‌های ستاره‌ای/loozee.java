import java.util.Scanner;

public class loozee {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int i;
        int j;
        int sp;
        for (i = 1;i <= n;i = i + 2)
        {
            sp = (n - i) / 2;
            for (j = 1;j <= sp;j++)
            {
                System.out.print(" ");
            }
            for (j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            for (j = 1;j <= 2 * sp;j++)
            {
                System.out.print(" ");
            }
            for (j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = n - 2;i >= 1;i = i - 2)
        {
            sp = (n - i) / 2;
            for (j = 1;j <= sp;j++)
            {
                System.out.print(" ");
            }
            for (j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            for (j = 1;j <= 2 * sp;j++)
            {
                System.out.print(" ");
            }
            for (j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
