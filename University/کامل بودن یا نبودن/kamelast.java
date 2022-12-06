import java.util.Scanner;
public class kamelast {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum = 0;
        int n=input.nextInt();



        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum)
            System.out.println("YES");
      else
        System.out.println("NO");
    }
}

