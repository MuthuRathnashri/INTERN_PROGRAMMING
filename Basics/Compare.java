import java.util.*;
public class Compare 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int number1 = input.nextInt();
        System.out.println("Enter number2 :");
        int number2 = input.nextInt();
        if(number1 > number2)
        {
            System.out.println(number1 + " is the greatest");
        }
        else if(number1 < number2)
        {
            System.out.println(number2 + " is the greatest");
        }
        else
        {
            System.out.println("Both numbers are equal ");
        }
    }
    
}
