import java.util.*;

public class Array {
    public static void main(String[] args){
        int s=-1;
        int n,l;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of elements in array :");
        n=input.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter ele :");
            num[i]=input.nextInt();
        }
        s = num[0];l=num[0];
        for(int i=0;i<n;i++)
        {
            if(num[i]<s)
            {
                s=num[i];
            }
            if(num[i]>l)
            {
                l=num[i];
            }
        }
        System.out.println("The smallest number in given array is " + s);
        System.out.println("The largest number in given array is " + l);
    }
    
}
