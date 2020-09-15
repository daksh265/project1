//This program prints the 1st 10 even numbers 
class simple2
{
    void print()
    {
        for(int i=0;i<20;i+=2)
        {
            System.out.println(i);
        }
    }
    public static void main()
    {
        simple2 obj=new simple2();
        obj.print();
    }
}
