class autoboxing
{
    int a; Integer b;
    void init()
    {
        b= new Integer(4563);
    }
    void print()
    {
        System.out.println(b);
    }
    public static void main()
    {
        autoboxing obj=new autoboxing();
        obj. init();
        obj. print();
    }
}
