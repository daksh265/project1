class wrapper6
{
    String a;
    void init()
    {
        a="10";
    }
    void calc()
    {
        byte i= Byte.parseByte(a);
        System.out.println(i);
    }
    public static void main()
    {
        wrapper6 obj=new wrapper6();
        obj.init();
        obj.calc();
    }
}
