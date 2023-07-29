import java.util.Scanner;
public class max_1{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String S=Integer.toBinaryString(num);
        S=String.format("%8s",S).replace(' ','0');
        System.out.println(S+"\n");
        int length=S.length();
        String leftNibble=S.substring(0,4);
        String rightNibble=S.substring(4);
        String new_binary=rightNibble+leftNibble;
        System.out.println(new_binary);
        int new_number=Integer.parseInt(new_binary,2);
        System.out.println(new_number);
    }
}
