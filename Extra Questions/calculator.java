//This is a simple calculator 
//It takes 2 no. from user and a character (+,-,/,*)
class calculator
{
    public static void main(double a,char ch, double b)
    {
        switch (ch)
        {
            case '+':
            double sum= a+b;
            System.out.println("The sum is "+sum);
            break;
            case '-':
            double diff= a-b;
            System.out.println("The diffrence is "+diff);
            break;
            case '/':
            double div= a/b;
            System.out.println("The Quotient is "+div);
            break;
            case '*':
            double mult= a*b;
            System.out.println("The Product is "+mult);
            break;
        }
    }
 }