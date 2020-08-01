class basic2
{
    int a;int b; int sum;
    void init(int no1,int no2)
    {
      a=no1;
      b=no2;
    }
    void calc()
    {
        sum=a+b;
    }
    void print()
    {
        System.out.println(sum);
    }
    public static void main()
    {
      basic2 obj= new basic2(); 
      obj. init(20,80);
      obj. calc();
      obj. print();
    }
}