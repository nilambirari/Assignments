import java.util.Scanner;

public class Assign2
{
    public static void main(String[] args)
    {
        int[] no=new int[10];
        int sum=0;
        double avg;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter no"+(i+1)+": ");
            no[i]=sc.nextInt();
            sum=sum+no[i];
        }

        avg=sum/10.0;
        System.out.println("Sum of the nos is: "+sum);
        System.out.println("Average of nos is: "+avg);
    }
}
