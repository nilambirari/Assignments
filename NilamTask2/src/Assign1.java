import java.util.Scanner;

public class Assign1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int i=sc.nextInt();
        if(i%3==0 && i%5==0)
            System.out.println("ConsultAdd JAVA Training");
        else
        {
            if (i % 3 == 0)
                System.out.println("ConsultAdd");
            if (i % 5 == 0)
                System.out.println("JAVA Training");
        }

    }
}
