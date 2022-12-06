import java.util.Scanner;
public class rshteresh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String s = input.next();
        char[] ch=s.toCharArray();
        String sss=" ";
        for (int i = 0; i < s.length(); i++) {
           int fakes = s.charAt(i);
            fakes += b;
            while (fakes > 122) {
                fakes -= 26;
            }
            ch[i]= (char) fakes;
        }
        s= String.valueOf(ch);
        int fakeb = b % a;
        for (int i = a - fakeb; i < a; i++) {
            System.out.print(s.charAt(i));
        }
        for (int i = 0; i <= a - fakeb - 1; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.print("\n");
    }
}
