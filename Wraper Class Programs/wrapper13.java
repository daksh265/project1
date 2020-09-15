class wrapper13
{
    char a; boolean i;
    void init()
    {
        a='r';
    }
    void calc()
    {
        if(Character.isLowerCase(a))
        {
            i=Character.isLowerCase(a);
            System.out.println("Lower Case "+i);
        }
        else if(i=Character.isUpperCase(a))
        {
            i=Character.isUpperCase(a);
            System.out.println("Upper case "+i);
        }
        else
        {
            System.out.println("Not in upper case or in lower case");
        }
    }
    public static void main()
    {
        wrapper13 obj=new wrapper13();
        obj. init();
        obj. calc();
    }
}
