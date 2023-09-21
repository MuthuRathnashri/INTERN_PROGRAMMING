package Lab2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class sales{
    public static void main(String[] args){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ip = new ArrayList<Integer>();
        ArrayList<Integer> sal = new ArrayList<Integer>();
        System.out.print("Enter number of employee:");
        int n = sc.nextInt();
        int[] ans = new int[9];
        Arrays.fill(ans,0);
        System.out.println("Enter all employee's gross sales");
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            ip.add(x);
        }
        for(int i=0;i<n;i++){
            y = ((ip.get(i)*9)/100)+200;
            sal.add(y);
        }
        System.out.println(ip);
        System.out.println(sal);
        for(int i=0;i<n;i++){
            z = (sal.get(i)/100)-2;
            if(z>=9)
            {z=8;}
            ans[z]++;
        }
        System.out.println("Table with count of employee based on range");
        System.out.println("Range\t\t\t| Count");
        System.out.println("---------------------------------");
        for(int i=0;i<8;i++){
            System.out.print(i+2+"00 - " + (i+2) +"99");
            System.out.println("\t\t| "+ans[i]);
        }
        System.out.println("1000 - over\t\t| "+ans[8]);
        sc.close();
    }

}
