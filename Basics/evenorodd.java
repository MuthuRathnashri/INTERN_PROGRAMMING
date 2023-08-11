import java.util.*;
public class evenorodd {
    public static void main(String[] args){
        System.out.println("Enter a number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0)
        System.out.println(number + " is Even Number");
        else
        System.out.println(number + " is Odd Number");
    }
}
