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
        for(i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                c=i;
                while(c!=0)
                 {
                    rem= c%10;
                    sum+=rem;
                    c=c/10;
                 }   
            }
        }
        while(b!=0)
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
        if(sum==a)
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
       obj.init(666);
       obj.calc();
       obj.print();
     }
    } 