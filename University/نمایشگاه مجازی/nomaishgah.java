import java.util.Scanner;

public class nomaishgah {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int ghorfe=0;
        for(int i=1;i<9;i++){
            if(i%2==0){
                System.out.print("#");
                for(int j=2;j>0;j--){
                    if(n>0){
                        ghorfe++;
                        n--;
                        System.out.print("ghorfe" + ghorfe);
                    }else {
                        System.out.print(".......");
                    }if(j==2){
                        System.out.print(".......");
                    }
                }
                System.out.print("#");
                System.out.println();
                continue;
            }
            System.out.println("########.......########");

        }

        System.out.println("#######################");
            }
}

