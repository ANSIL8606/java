import java.util.Scanner;
public class OverloadShapeArea {
void calculateArea(float x)
{
System.out.println("Area_of_the_square:_"+x*x+"_sq_units");
}
void calculateArea(float x,float y)
{
System.out.println("Area_of_the_rectangle:_"+x*y+"_sq_units");
}
void calculateArea(double r)
{
double area = 3.14*r*r;
System.out.println("Area_of_the_circle:_"+area+"_sq_units");
}
public static void main(String args[]){
OverloadShapeArea obj = new OverloadShapeArea();
System.out.println("Enter_the_side_of_a_square:_");
Scanner sc = new Scanner(System.in);
float side = sc.nextFloat();
obj.calculateArea(side);
System.out.println("Enter_the_sides_of_the_rectangle:_");
float side1 = sc.nextFloat();
float side2 = sc.nextFloat();
obj.calculateArea(side1,side2);
System.out.println("Enter_the_radius_of_the_circle:_");
double rad = sc.nextDouble();
obj.calculateArea(rad);
}
}