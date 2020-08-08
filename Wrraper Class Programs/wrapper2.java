class wrapper2
{
    String i;
    void init()
    {
        i="100";
    }
    void wrap()
    {
        int a= Integer.parseInt(i);
        System.out.println(a);
    }
    public static void main()
    {
        wrapper2 obj=new wrapper2();
        obj. init();
        obj. wrap();
    }
}