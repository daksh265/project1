//This program prints first 50 numbers in reverse order
class simple3
{
    int i;
    void print()
    {
        for(i=50;i>=1;i--)
        {
            System.out.println(i);
        }
    }
    public static void main()
    {
        simple3 obj=new simple3();
        obj.print();
    }
}
