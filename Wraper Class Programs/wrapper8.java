class wrapper8
{
    byte a; String i;
    void init()
    {
        a=15;
    }
    void calc()
    {
        i=Byte.toString(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper8 obj=new wrapper8();
        obj.init();
        obj.calc();
    }
}