public class question5
{
    char n; int i; String s; String ans; String Ans; int a; int b;
    void init(char ch, String choice)
    {
        s = choice;
        n = ch;
        a = 1;
        Ans = "";
        ans = "";
    }
    void calcAndPrint()
    {
        switch(s)
        {
            case "number":
            for(i=48;i<n;i++)
            {
                ans += a++;
                System.out.println(ans);
            }
            break;
            case "alphabet":
            for(i=97;i<=n;i++)
            {
                for(b=97;b<=n-i+97;b++)
                {
                    System.out.print((char)b);
                }
                System.out.println("");
            }
            break;
            default:
            System.out.println("ERROR");
            break;
        }
    }
    public static void main()
    {
      question5 obj= new question5(); 
      obj. init('4', "number");
      obj. calcAndPrint();
    }
}