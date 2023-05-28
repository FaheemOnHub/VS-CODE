import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the no. of switches");
        
        int n= hi.nextInt();
        
        boolean b[]=new boolean[n+1];
        
        int i,j,c=0;
        
        for(i=2;i<=n;i++) //here i=2 because we are leaving the first switch, this is often done in switch-related problems 
                          //where the first switch has a different behavior or is considered a constant.
        {
            for(j=i;j<=n;j=j+i)
            {
                if (b[j]==false)
                b[j]=true;
                else
                {
                    b[j]=false;
                }
            }
        }
        
        for(i=1;i<=n;i++)
        {
            if (b[i]==false)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}
