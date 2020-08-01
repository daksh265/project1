class wrapper1
{
    int i;
    void init()
    {
        i=10;
    }
    void wrap()
    {
        Integer a=i;
        System.out.println(a);
    }
    public static void main()
    {
        wrapper1 obj=new wrapper1();
        obj. init();
        obj. wrap();
    }
}