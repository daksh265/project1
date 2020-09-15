class wrapper11
{
    char a; boolean i;
    void init()
    {
        a='s';
    }
    void calc()
    {
        i=Character.isLetter(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper11 obj=new wrapper11();
        obj. init();
        obj. calc();
    }
}
