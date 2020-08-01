class DisplayTime
{
    public static void main(long hrs, long mins, long secs)
    {
        Time obj =new Time();
        obj. Accept(hrs, mins, secs);
        obj. convert();
        obj. showResult();
    }
}