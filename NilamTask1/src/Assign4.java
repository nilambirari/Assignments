import java.util.Scanner;

public class Assign4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1 (in between 1 to 10): ");
        int i=sc.nextInt();
        System.out.println("Enter no2 (in between 1 to 10): ");
        int j=sc.nextInt();
        int z=i+j;
        int result=z+30;
        System.out.println("Final result is: "+result);

    }
}
