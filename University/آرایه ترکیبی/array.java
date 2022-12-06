import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=input.next();
        }
        while(true)
        {
            int a=input.nextInt();
            if(a==0)
            {
                break;
            }
            else if(a==1)
            {
                int x=0;
                for(int i=0;i<n;i++)
                {
                    if(find(s[i],"java")!=-1)
                    {
                        x++;
                    }
                }
                System.out.println(x);
            }
            else if(a==2)
            {
                double x=0,y=0;
                for(int i=0;i<n;i++)
                {
                    if(find(s[i],"code")==0)
                    {
                        x+=s[i].length();
                        y++;
                    }
                }
                if(y!=0)
                {
                    System.out.println(x/y);
                }
                else
                {
                    System.out.println("0");
                }
            }
            else if(a==3)
            {
                boolean x=true;
                for(int i=0;i<n;i++)
                {
                    if(s[i].length()<3)
                    {
                        x=false;
                        System.out.println(i);
                    }
                }
                if(x)
                {
                    System.out.println("empty");
                }
            }
        }
    }
    public static int find(String s,String t)
    {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        int x=-1;
        for(int i=0;i<s.length();i++)
        {
            if(c1[i]==c2[0])
            {
                boolean b=true;
                for(int j=0;j<t.length();j++)
                {
                    if(c1[i+j]!=c2[j])
                    {
                        b=false;
                        break;
                    }
                }
                if(b)
                {
                    x=i;
                    break;
                }
            }
        }
        return x;
    }
}
