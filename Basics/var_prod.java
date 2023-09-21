package Lab2;

import java.util.Scanner;
public class var_prod{
public static int sum(int... list){
int p=1;
for(int i=0;i<list.length;i++){
p=p*list[i];
}
return p;
}
public static void main(String[] args){
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements in array:");
n = sc.nextInt();
int[] array = new int[n];
System.out.println("Enter elements of array:");
for(int i=0;i<n;i++){
array[i] = sc.nextInt();
}
System.out.println("Product of eachh element in given array is:"+sum(array));
System.out.println("Product of eachh element in given array is:"+sum(5,10));
sc.close();
}
}