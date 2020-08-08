//It is a simple program that add to no. and displays the summ
class add
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
      add obj= new add(); 
      obj. init(20,80);
      obj. calc();
      obj. print();
    }
}