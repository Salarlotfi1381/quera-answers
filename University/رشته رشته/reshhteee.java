
import java.util.ArrayList;
import java.util.Scanner;
public class reshhteee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        String [] src=new String[n];
        String [] dst=new  String[k];
        for (int i = 0; i < n; ++i) {
            src[i]=input.next();
        }
        for (int i = 0; i < k; ++i) {
            dst[i]=input.next();
        }
        for (String d : dst) {
            int sim = 0;
            for (String s : src) {
                if (s.length() == d.length()) {
                    if (check_upper(s, d)) {
                        ++sim;
                    } else if (check_change(s, d)) {
                        ++sim;
                    }
                } else if (Math.max(s.length(), d.length()) - Math.min(s.length(), d.length()) == 1) {
                    int i = 0;
                    int j = 0;
                    int skip = 0;
                    while (i < s.length() && j < d.length()) {
                        if (s.charAt(i) != d.charAt(j)) {

                            if (skip == 1) {
                                ++skip;
                                break;
                            } else {
                                ++skip;
                                if (s.length() < d.length()) {
                                    ++j;
                                } else {
                                    ++i;
                                }
                            }
                        } else {
                            ++i;
                            ++j;
                        }
                    }
                    if (skip <= 1) {
                        ++sim;
                    }
                }
            }
            System.out.print(sim);
            System.out.print("\n");
        }

}
    private static boolean check_upper(String s, String d) {
        String a = s;
        String b = d;
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.equals(b);
    }

    private static boolean check_change(String s, String d) {
        int c = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != d.charAt(i)) {
                ++c;
            }
        }
        return c == 1;
    }
    }
