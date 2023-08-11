import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius,area,diameter,perimeter;
        System.out.println("Enter radius of circle :");
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        diameter = 2 * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Area : " + area);
        System.out.println("Diameter: " + diameter);
        System.out.println("Perimeter : " + perimeter);
    }
}
