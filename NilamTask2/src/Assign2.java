import java.util.Scanner;

public class Assign2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int opt;
        double first, second, result;
        System.out.println("Enter First No: ");
        first=sc.nextDouble();
        System.out.println("Enter Second No: ");
        second=sc.nextDouble();

        do
        {
            System.out.println("---------------------------");
            System.out.println("Option1: Addition");
            System.out.println("Option2: Subtraction");
            System.out.println("Option3: Multiplication");
            System.out.println("Option4: Division");
            System.out.println("Option5: Average");
            System.out.println("----------------------------");
            System.out.println("Enter your Option: ");
            opt=sc.nextInt();
            switch (opt)
           {
               case 1:
                   result=first+second;
                   if(result<0)
                       System.out.println("Oops Option1 is returning negative number ");
                   else
                       System.out.println("Addition is: "+result);
                   break;
               case 2:
                   result=first-second;
                   if(result<0)
                       System.out.println("Oops Option2 is returning negative number ");
                   else
                       System.out.println("Subtraction is: "+result);
                   break;
               case 3:
                   result=first*second;
                   if(result<0)
                       System.out.println("Oops Option3 is returning negative number ");
                   else
                       System.out.println("Multiplication is: "+result);
                   break;
               case 4:
                   result=first/second;
                   if(result<0)
                       System.out.println("Oops Option4 is returning negative number ");
                   else
                       System.out.println("Division is: "+result);
                   break;
               case 5:
                   result=(first+second)/2;
                   if(result<0)
                       System.out.println("Oops Option5 is returning negative number ");
                   else
                       System.out.println("Average is: "+result);
                   break;
           }
        }while(opt<=5);
    }
}
