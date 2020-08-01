 class Time
{
    long hr; long min; long sec;
    Time()
    {
        long hr=0;
        long min=0;
        long sec=0;
    }
    void Accept(long hour, long minutes, long seconds)
    {
        hr=hour;
        min=minutes;
        sec=seconds;
    }
    void convert()
    {
        hr=hr*60*60;
        min=min*60;
        sec=hr+min+sec;
    }
    void showResult()
    {
        System.out.println("The Result is "+sec);
    }
}