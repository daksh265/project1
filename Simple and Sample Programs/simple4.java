import java.util.Scanner;
class simple4
{
    void init()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int times=0;
        for(int i=0;i<len;i++)
        {
            char a=str.charAt(i);
            if(a=='s')
            {
                times+=1;
            }
        }
        System.out.println(times);
    }
    public static void main()
    {
        simple4 obj=new simple4();
        obj.init();
    }
}
