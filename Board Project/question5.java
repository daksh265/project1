// This program is 5th Question of the board project
class question5
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
            for(i=48;i<n;i++)// It will Print the nos. in the given pattern
            {
                ans += a++;
                System.out.println(ans);
            }
            break;
            case "alphabet":
            for(i=97;i<=n;i++) //This loop will help to print rows 
            {
                for(b=97;b<=n-i+97;b++) //This loop will heelp to print the columns
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
      obj. init('d', "alphabet");
      obj. calcAndPrint();
    }
}