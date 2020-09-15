class tech_num2
{
    boolean calc(int n)
    {
        int f,l,sq;
        l=n%100;
        f=n/100;
        sq=(int)Math.pow((f+l),2);
        if(n==sq)
            return true;
        else
            return false;
    }
    public static void main()
    {
        tech_num2 obj=new tech_num2();
        for(int i=1000;i<=9999;i++)
        {
            if(obj.calc(i) == true)
                System.out.println(i);
        }
    }
}
