//This program calculates the area of triangle by using 2 method
//It uses overloading for calculating the area
class TriangleArea
{
    void Area(double side1,double side2,double side3)//It is the Herons formula and can be applied for any of the triangle
    {
        double s=side1+side2+side3;
        double area1=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The Area of the Triangle is "+area1);
    }
    void Area(double Base, double Height)//This is another formula but only for Right angled triangle
    {
        double area2=(1*Base*Height)/2;
        System.out.println("The Area of the Triangle is "+area2);
    }
    public static void main()
    {
        TriangleArea obj=new TriangleArea();
        obj. Area(5,8,9);
        obj.Area(5,1);
    }
}