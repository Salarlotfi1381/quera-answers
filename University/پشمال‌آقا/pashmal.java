import java.util.Scanner;

public class pashmal {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int q = Scan.nextInt();
        double n = Scan.nextDouble();
        int m = Scan.nextInt();
        int sum = (int) (n * m * q);
        System.out.print(sum);
    }
}
