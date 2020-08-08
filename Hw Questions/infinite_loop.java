class infinite_loop
{
    int k;
    void init()
    {
        k=100;
    }
    void loop()
    {
        while(k<=101)
        {
            System.out.println(k);
            k--;
        }
    }
    public static void main()
    {
        infinite_loop obj=new infinite_loop();
        obj. init();
        obj. loop();
    }
}
