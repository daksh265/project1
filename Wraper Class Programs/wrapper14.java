class wrapper14
{
    char a; boolean i;
    void init()
    {
        a=' ';
    }
    void calc()
    {
        i=Character.isWhitespace(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper14 obj=new wrapper14();
        obj. init();
        obj. calc();
    }
}