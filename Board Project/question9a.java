// This program is 9th a Question of the board project
class question9a
{
    int sum; int n; int i;
    void init()
    {
        sum=0;
        n=20;
    }
    void calc()
    {
        for(i=0;i<=n;i+=2)
        {
            if(i%4==0)
            {
              sum-=i;
            }
            else
            {
              sum+=i;
            }
        }
    }
    void print()
    {
        System.out.println(sum);
    }
    public static void main()
    {
      question9a obj= new question9a(); 
      obj. init();
      obj. calc();
      obj. print();
    }
}
