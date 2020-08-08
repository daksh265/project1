// This program display the multiple of 3 till 36
class mutiple_of_3
{
    int a;
    void calc()
    {
        for(a=3;a<=36;a+=3)
        {
            System.out.println(a);
        }
    }
    public static void main()
    {
        mutiple_of_3 obj=new mutiple_of_3();
        obj.calc();
    }
}