// This program is 4th Question of the board project
class question4
{
    String opt; double p ; double r; double n; double A; 
    void init()  
    {
        opt ="Term Deposit ";
        p = 10000.00;
        r = 10.0;
        n = 5.0;
     }
    void calcAndPrint()
    {
         switch (opt)
        {
            case "Term Deposit ":
            A = p*(Math.pow((1 + r/100),n)); // to calculate the amount for Term Deposite
            System.out.print("Maturity Amount  is "+A);
            break;
            case "Recurring Deposit ":
            n = n/12; 
            A = (p * n) + (p *((n*(n+1))/2)*(r/100)*(1/12)); // to calculate the amount for Recurring Deposite
            System.out.print("Recurring Deposit   is "+A);
            break;
            default:
            System.out.println("ERROR");
            break;
        } 
    }
    public static void main()
    {
        question4 obj= new question4(); 
        obj. init();
        obj. calcAndPrint();
    }
}