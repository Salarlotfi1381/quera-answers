import java.util.Scanner;

public class golbano {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
         int l = s.length();
        String reverse = "";


        for(int i =l-1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
}
