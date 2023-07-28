//
import java.util.Scanner;
class glass_hour{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][]hour_glass=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                hour_glass[i][j]=sc.nextInt();
            }
        }
        
        int result=find_max(row,column,hour_glass);
        System.out.println(result);
    }
    
    public static int find_max(int row,int column,int hour_glass[][])
    {
        int max_sum=0;
        int sum=0;
        for(int i=0;i<row-2;i++)
        {
            for(int j=0;j<column-2;j++)
            {
                sum=(hour_glass[i][j]+hour_glass[i][j+1]+hour_glass[i][j+2]
                    +hour_glass[i+1][j+1]
                    +hour_glass[i+2][j]+hour_glass[i+2][j+1]+hour_glass[i+2][j+2]);
                    max_sum=Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }
}
