class wrapper5
{
    String i; String str;
    void init()
    {
        i="Byee";
        str= new String(i);
    }
    void wrap()
    {
        System.out.println(str.toString());    
    }
    public static void main()
    {
        wrapper5 obj=new wrapper5();
        obj. init();
        obj. wrap();
    }
}
 