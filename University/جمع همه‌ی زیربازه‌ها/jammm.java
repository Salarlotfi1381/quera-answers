import java.util.Scanner;
import java.math.BigInteger;
public class jammm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers=new int[n];
        for (int i=0; i<n; i++)
        {
            numbers[i]=input.nextInt();
        }
        BigInteger result=new BigInteger("0");
        for (int i=0; i<n; i++)
        {
            int a=i+1,b=n-i;
            BigInteger x=new BigInteger(String.valueOf(a));
            x=x.multiply(BigInteger.valueOf(b));
            x=x.multiply(BigInteger.valueOf(numbers[i]));
            result=result.add(x);
        }
        System.out.println(result);
    }
}
