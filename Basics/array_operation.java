package Lab2;
import java.util.Arrays;
public class array_operation {
    public static void main(String[] args){
        int[] arr = new int[10];
        Arrays.fill(arr,0);
        System.out.println("Array with zeros\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "|");
        }
        System.out.println("\n");
        int[] bonus = new int[15];
        for(int i=0;i<bonus.length;i++){
            bonus[i]+=1;
        }
        System.out.println("Array increament by 1\n");
        for(int i=0;i<bonus.length;i++){
            System.out.print(bonus[i]+"|");
        }
        System.out.println("\n");
        int[] score=new int[]{10,2,8,4,20,12,14};
        Arrays.sort(score);
        System.out.println("First 5 best scores\n");
        for(int i=0;i<5;i++){
            System.out.print(score[i]+"|");
        }
    }
}
