import java.util.Scanner;

public class classss {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int k = scnr.nextInt();
        String kh = "";
        for (int i = 1; i <= k+1; i++) {
            kh= kh +i;
        }
        char result = kh.charAt(k-1);
        System.out.println(result);
    }
}
