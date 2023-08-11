import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds(lb) :");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches(in) :");
        double height = sc.nextDouble(); 
        double ans = (weight * 703)/(height * height);
        System.out.println("The Body Mass Index (BMI) is " + ans);
        if(ans < 18.5)
        System.out.println("Thinness");
        else if(ans < 25)
        System.out.println("Normal");
        else if(ans < 30)
        System.out.println("Overweight");
        else
        System.out.println("Obese");
    }
}
