public class overloading
{
   int sum;
   void inside(int a, int b)
    {
        sum= a+b;
        System.out.println(sum);
   }
   void inside(double d , double e)
    {
        double q2 =d+e;
        System.out.println(q2);
    }
}