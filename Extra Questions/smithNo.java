//This program tells whether the number given by the user is a smith number or not
//A Smith number whose sum of digit is the same as its sum of its prime factor (excluding 1)
class smithNo
{
    int i; int sum; int n; int s; int a; int rem; int b; int c;
      void init(int no)
    {
        n=no;
        b=no;
        s=0;
        sum=0;
       }
     void calc()
    {
        for(i=2;i<=n;i++)//This loop will exclude 1 to add in prime factors
        {
            while(n%i==0)//This loop will do the prime factorization
            {
                n=n/i;
                c=i;
                while(c!=0)//This loop will find the sum of prime factors
                 {
                    rem= c%10;
                    sum+=rem;
                    c=c/10;
                 }   
            }
        }
        while(b!=0)//This will do the sum of the digit 
        {
            rem= b%10;
            a+=rem;
            b=b/10;
         }
        }
    void print()
    {
        System.out.println(" Sum of Prime Factors is "+sum);
        System.out.println(" Sum of Digits "+a); 
        if(sum==a)//This will find if the no. is a smith number
        {  
             System.out.println(" Therfore this No. is a Smith No. ");
          }
        else
        {
            System.out.println(" Therfore this No. is not a Smith No. ");
          }
        }
    public static void main()
    {
       smithNo obj = new smithNo();
       obj.init(27);
       obj.calc();
       obj.print();
     }
} 