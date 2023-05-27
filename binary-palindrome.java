import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner hi = new Scanner(System.in);
        int num = hi.nextInt();
        String s = Integer.toBinaryString(num);
        System.out.println(s);
        int flag=0;
        int left=0;
        int right=s.length()-1;
        
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                flag=0;
                break;
            }
            left++;
            right--;
            flag=1;
        }
        
        if(flag>0)
        {
            System.out.println("Number is a palindrome");
        }
        else
        {
            System.out.println("NOPE");
        }
        
    }
    
    
    
}
