class counting
{
    int count;
    void init()
    {
        count=0;
    }
    void calc()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count+=1;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        counting obj =new counting();
        obj. init();
        obj. calc();
    }
}    
