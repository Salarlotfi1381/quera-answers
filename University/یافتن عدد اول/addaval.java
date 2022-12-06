import java.util.Scanner;

public class addaval {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int t = n;
        int b=0;
        int count;
        int counter = 1;

        while (n > 0) {
            b += n % 10;
            n = n / 10;
        }

        int i=t;
        int j;
        while(true) {
            i++;
            count = 0;
            for (j=1;j <= i;j++)
                if(i%j==0)
                    count++;

            if(count==2 && counter==b) {
                System.out.println(i);
                break;
            }
            else if(count==2)
                counter++;
        }

    }

}
