class question9b
{
    double sum; double n; double i; double a;
    void init(double x)
    {
        sum=0;
        n=20;
        a=x;
    }
    void calc()
    {
        for(i=1;i<=n;i+=3)
        {
            sum += a/i;
        }
    }
    void print()
    {
        System.out.println(sum);
    }
    public static void main()
    {
      question9b obj= new question9b(); 
      obj. init(20.0);
      obj. calc();
      obj. print();
    }
}
