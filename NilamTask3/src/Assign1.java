import java.util.Scanner;

public class Assign1
{
    public static void main(String[] args)
    {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        no=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(no+" * "+i+" = "+(no*i));
        }
    }
}
