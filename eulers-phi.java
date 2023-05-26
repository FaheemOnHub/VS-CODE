import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        System.out.println("Enter a no.");
        Scanner hi= new Scanner(System.in);
        int num=hi.nextInt();
        int result=num;
        int p;
        for( p=2;p*p<=num;++p)
        {
            if(num%p==0)
            {
                while(num%p==0)
                    num=num/p;
                    result=result-result/p;
            }
        }
        if(num>1)
            {
                result=result-result/num;
            }
        
        System.out.println(result);
    }
}
