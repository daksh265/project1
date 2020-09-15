class wrapper7
{
    String a;
    void init()
    {
        a="11";
    }
    void calc()
    {
        byte i= Byte.valueOf(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper7 obj=new wrapper7();
        obj.init();
        obj.calc();
    }
}
