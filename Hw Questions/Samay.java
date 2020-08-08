class Samay
{
    int hr, min;
    void input(int h, int m)
    {
        hr=h;
        min=m;
    }
    void addTime(Samay obj1,Samay obj2)
    {
        int total_Time=(obj1. hr*60)+(obj1. min)+(obj2. hr*60)+(obj2. min);
        hr=total_Time/60;
        min=total_Time%60;
    }
    void display()
    {
        System.out.println("The Sum of Time is "+hr+" Hrs "+min+" mins ");
    }
}