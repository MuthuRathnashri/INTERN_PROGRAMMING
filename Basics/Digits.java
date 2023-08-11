import java.util.*;
public class Digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        int m = n,c=0,r;
        while(m != 0){
            r = m % 10;
            c++;
            m = m / 10;
        }
        if(c == 5)
        {
        System.out.println("The given number has 5 digits.");
        int k = n,l = n % 10,f = 1;
        while(k != 0){
            r = k % 10;
            if( l == r)
            {
                l--;
            }
            else{
                f = 0;
                break;
            }
            k = k / 10;
        }
        if( f == 0)
        System.out.println("The given number is not sequential.");
        else
        System.out.println("The given number is sequential.");
        }
        else if(c < 5)
        System.out.println("The given number has less than 5 digits.");
        else
        System.out.println("The given number has more than 5 digits.");
    }
    
}
