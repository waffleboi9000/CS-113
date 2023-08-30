// ************************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
// ************************************************************
import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);
        int radius;
        System.out.println("Enter a radius: ");
        radius = scan.nextInt();

        double area = PI*radius*radius;
        System.out.println("The area of a circle with radius " + radius +" is " + area);

        double circumference = 2*PI*radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
                
        /* int radius = 10;
        double area1 = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius +
                " is " + area1);
        double circumference1 = 2*PI*radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        radius = 20;
        double area2 = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        double circumference2 = 2*PI*radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
        double areaChange = area2/area1;
        System.out.println("The area changes by a factor of " + areaChange + " when the area doubles");
        double circumferenceChange = circumference2/circumference1;
        System.out.println("The circumference changes by a factor of " + circumferenceChange + " when the area doubles"); */
    }
}