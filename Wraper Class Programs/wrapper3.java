class wrapper3
{
    String i;
    void init()
    {
        i="string";
    }
    void wrap()
    {
        int a= Integer.valueOf(i);
        System.out.println(a);
    }
    public static void main()
    {
        wrapper3 obj=new wrapper3();
        obj. init();
        obj. wrap();
    }
}