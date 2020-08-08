// This program is 3rd Question of the board project
class question3
{
    int i; int n; double s;
    void init()
    {
        n = 20;
    }
    void calc()
    {
        for(i=1;i<=n;i++)
        {
            s = Math.random()*100;
            System.out.println(s);
        }
    }
     public static void main()
    {
       question3 obj= new question3(); 
       obj. init();
       obj. calc();
      }
}                                                                                                