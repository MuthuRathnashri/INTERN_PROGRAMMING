package Lab2;

import java.util.Scanner;
class rectangle1{
double b = 1;
double h = 1;
public void set(double b,double h){
if(b>=0.0 && b<=20.0){
this.b=b;
this.h=h;
System.out.print("Successfully validate");
}
else
{
System.out.print("Invalid");
}
}
public double getb(){return b;}
public double geth(){return h;}
public double area()
{
return b*h;
}
public double peri()
{
return 2*(b+h);
}
}
public class recset{
public static void main(String[] args){
double b,h;
Scanner sc = new Scanner(System.in);
rectangle1 r = new rectangle1();
System.out.print("Enter breadth:");
b = sc.nextDouble();
System.out.print("Enter height:");
h = sc.nextDouble();
r.set(b,h);
System.out.println("\nBreadth :" + r.getb());
System.out.println("height :" + r.geth());
System.out.println("Area:"+r.area());
System.out.println("Perimeter :"+r.peri());
sc.close();
}
}

