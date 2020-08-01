

class Area1
{
    int l;int b;int area;
    void init()
    {
       l= 18;
       b= 20;
     }
    void calcArea()
    {
       area= l*b;
    }
    void print()
    {
       System.out.println(" The Area is "+area);
    }
    public static void main()
    {
       Area1 obj = new Area1();
       obj.init();
       obj.calcArea();
       obj.print();
     }
}