import java.util.*;
public class Addition
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int choice,number1,number2;
        do
        {
        System.out.println("\n1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5. Exit\n");
        System.out.print("Enter choice :");
        choice=ip.nextInt();
        if(choice == 5)
        break;
        System.out.print("Enter number1 :");
        number1=ip.nextInt();
        System.out.print("Enter number2 :");
        number2=ip.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
            default:
                break;
        }
        }while(choice!=5);
    }
}