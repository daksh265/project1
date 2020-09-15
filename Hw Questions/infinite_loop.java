//This program print infinite loop
//This program is a Hw Question
class infinite_loop
{
    int k;
    void loop()
    {
        for(k=100;;k--)//This for loop will execute infinite time
        {
            System.out.println(k);//It will make a infinite looping statement
        }
    }
    public static void main()
    {
        infinite_loop obj=new infinite_loop();
        obj. loop();
    }
}
