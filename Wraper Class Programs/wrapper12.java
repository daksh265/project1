class wrapper12
{
    char a; boolean i;
    void init()
    {
        a='%';
    }
    void calc()
    {
        i=Character.isLetterOrDigit(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper12 obj=new wrapper12();
        obj. init();
        obj. calc();
    }
}
