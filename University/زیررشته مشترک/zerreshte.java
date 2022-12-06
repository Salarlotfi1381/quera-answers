import java.util.Scanner;

public class zerreshte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = input.next();
        }
        String longest_sub = "";
        int index = 0;
        int starting_point = 0;
        while (index != strings[0].length()) {
            index += 1;
            String substring = "";
            for (int i = starting_point; i < index; i++) {
                substring += strings[0].charAt(i);
            }
            if (checker(substring, strings)) {
                if (substring.length() > longest_sub.length()) {
                    longest_sub = substring;
                }
            } else {
                starting_point += 1;
                index = starting_point;
            }
        }
        System.out.print(longest_sub);
    }

    public static boolean checker(String substring, String[] strings) {
        String originalString = substring;
        StringBuffer buffer = new StringBuffer(originalString);
        buffer = buffer.reverse();
        for (String go : strings) {

            if (!(go.contains(substring)|go.contains(buffer))  ) {

                return false;
            }
        }
        return true;
    }
}
