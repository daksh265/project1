// This program prints the reverse of the no given by the user
import java.util.Scanner;
class Reverse
{
    int no; int rev; int rem;
    Reverse()//This is a constructor 
    {
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
    }
    void find_reverse()
    {
        while(no>0)// This is the main step 
        {
            rem=no%10;
            rev=(rev*10)+rem;// This finds the reverse of the number
            no=no/10;
        }
    }
     void print()//This method prints the reversed no
    {
        System.out.println("The Reverse of the number is "+rev);
    }
    public static void main()
    {
        Reverse R2=new Reverse();
        R2.find_reverse();
        R2.print();
    }
}
