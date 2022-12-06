import java.util.Scanner;

public class jojo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int[] aray = new int[n];
       for (int i=0 ;i<n ;i++){
           aray[i]=in.nextInt();

       }
       boolean das=false;
       for(int j=1;j<n-1;j++){
           if(aray[j]>aray[j-1]&&aray[j]>aray[j+1]){
               das=true;
               break;
           }
       }
        if(das)
            System.out.println("Ey baba :(");
        else
            System.out.println("Bah Bah! Ajab jooji!");
    }



}
