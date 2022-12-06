import java.util.Scanner;

public class sabze {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float k = in.nextFloat();
        float s = in.nextFloat();
        if(s >= (n*k)) {
            System.out.println("Kafie!");
        }else
            System.out.println("Na! yeki bayad bere sabzi bekhare");
    }
}
