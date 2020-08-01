class TriangleArea
{
    double s1,s2,s3,area1,area2,base,height,s;
    void Area(double side1,double side2,double side3)
    {
        s1=side1;
        s2=side2;
        s3=side3;
        s=s1+s2+s3;
        area1=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The Area of the Triangle is "+area1);
    }
    void Area(double Base, double Height)
    {
        base=Base;
        height=Height;
        area2=(1*base*height)/2;
        System.out.println("The Area of the Triangle is "+area2);
    }
    public static void main()
    {
        TriangleArea obj=new TriangleArea();
        obj. Area(5.0,8.0,9.0);
        obj.Area(5.0,1.0);
    }
}