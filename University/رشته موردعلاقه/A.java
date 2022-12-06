import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a= in.next();
        int alen = a.length();
        int n = in.nextInt();
        String[] rs = new String[n];
        for (int i = 0; i < n; i++)
        {
            rs[i] = in.next();
        }
        int tedad = 0;
        for (int i = 0; i < n; i++)
        {
            int slen = rs[i].length();
            boolean e = false;
            boolean shamel = false;
            int idx = 0;
            for (int j = 0; j < slen; j++)
            {
                if (rs[i].charAt(j) == a.charAt(idx))
                {
                    idx++;
                }
                if (idx == alen)
                {
                    tedad++;
                    break;
                }
            }
        }
        System.out.print(tedad);
    }
}
