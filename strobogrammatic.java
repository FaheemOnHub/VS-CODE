import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
       System.out.println("Enter the number");
        Scanner hi=new Scanner(System.in);
        String num=hi.nextLine();
        
        int flag=0;
        int left=0;
        int right=num.length()-1;
        
        while(left<=right)
        {
            char leftchar=num.charAt(left);
            char rightchar=num.charAt(right);
            
            
            if ((leftchar=='0' && rightchar=='0') ||
                (leftchar=='1' && rightchar=='1') ||
                (leftchar=='6' && rightchar=='9') ||
                (leftchar=='9' && rightchar=='6') ||
                (leftchar=='8' && rightchar=='8'))
                {
                    left++;
                    right--;
                }
                else{
                    flag=0;
                    break;
                    }
                    flag=1;
        }
        if(flag==1)
        {
            System.out.println(num+" is a Strobogrammatic number");
        }
        else{
            System.out.println(num+" is a not Strobogrammati  number");
    }
}
}
