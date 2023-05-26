import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner hi=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=hi.nextInt();
        boolean[]array=new boolean[num+1];
        
        for(int i=0;i<array.length;i++)
        {
            array[i]=true;
        }
        for(int i=2;i<num;i++)
        {
            if(array[i]==true)
            {
                for(int j=(i*i);j<=num;j=j+i)
                {
                    array[j]=false;
                }
            }
        }
        System.out.println("List of prime numbers upto "+num+" ");
        for(int i=2;i<array.length;i++)
        {
            if(array[i]==true)
            {
                System.out.println(i);
            }
        }
    }
}
