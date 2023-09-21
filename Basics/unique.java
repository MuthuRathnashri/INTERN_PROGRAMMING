package Lab2;

import java.util.Scanner;

public class unique{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int limit =0;
        boolean uni = true;
        while(limit < 5){
        uni = true;
        System.out.print("Enter number between 10 to 100:");
        int num = sc.nextInt();
        for(int i:arr){
        if(i == num)
        {
        uni = false;
        break;
        }
        }
        if(uni)
        {
        arr[limit] = num;
        limit++;
        }
        System.out.println("Unique Elements are:");
        for(int i:arr)
        {
        System.out.print(i+"-");
        }
        System.out.print("\n\n");
        }
        sc.close();
    }
}

