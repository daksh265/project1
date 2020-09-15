class wrapper9
{
    String a;
    void init()
    {
        a="Hi";
        a=new String(a);
    }
    void calc()
    {
        System.out.println(a.toString());
    }
    public static void main()
    {
        wrapper9 obj=new wrapper9();
        obj. init();
        obj. calc();
    }
}