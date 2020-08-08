// This program is 10th Question of the board project
public class question10
{
     char a; char b; String x; String ch; int i; int l;
     void init()
     {
          x= "";
          a='*';
          b='#';
          ch="";
    }
    void calc()
     {
           for(i=1;i<=5;i++)
          {
               if(i%2==0)
               {
                    x+= b;
               }
               else
               {   
                   x+= a;
               }
               System.out.println(x);
            } 
            for(int j=1;j<=5;j++)
           {
              for(i=5;i>=j;i--)
              {
                  System.out.print(i);
                 } 
              System.out.println();
          }
    } 
    public static void main()
    {
       question10 obj= new question10(); 
       obj. init();
       obj. calc();
        }
}