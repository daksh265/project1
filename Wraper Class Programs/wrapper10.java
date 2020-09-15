class wrapper10
{
    char a; boolean i;
    void init()
    {
        a='s';
    }
    void calc()
    {
        i=Character.isDigit(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper10 obj=new wrapper10();
        obj. init();
        obj. calc();
    }
}
