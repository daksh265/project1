class unboxing
{
    int b; Integer a;
    void init()
    {
        a=20;
        b=a;
    }
    void print()
    {
        System.out.println(b);
    }
    public static void main()
    {
        unboxing obj=new unboxing();
        obj. init();
        obj. print();
    }
}
