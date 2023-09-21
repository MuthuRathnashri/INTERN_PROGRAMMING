package Lab2;

public class dice{
public static void main(String[] args){
int[] sum = new int[12];
int first,second,s;
for(int i=0;i<36000000;i++){
first = ((int) (Math.random()*(7 - 1))) + 1;
second = ((int) (Math.random()*(7 - 1))) + 1;
s = first + second-2;
sum[s]+=1;
}
for(int i=0 ;i<=10;i++)
{
System.out.println(i+2 + "\t\t" + sum[i]);
}
}
}