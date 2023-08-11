import java.util.*;
public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers ");
        int n = sc.nextInt();
        int positiveCount=0,negativeCount=0,zeroCount=0;
        int[] array = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(array[i] > 0)
            positiveCount++;
            else if(array[i] < 0)
            negativeCount++;
            else
            zeroCount++;
        }
        System.out.println("Positrive Count :" + positiveCount);
        System.out.println("Negative Conut :" + negativeCount);
        System.out.println("Zero Conut :" + zeroCount);

    }
}
