class Week
{
    char day; // only from 1 to 7
    Week()
    {
        day=1;
    }
    Week(char Day)
    {
        day=Day;
    }
    void Calc_Day()
    {
        switch (day)
        {
            case 1:
            System.out.println("The Day is Monday \nIt is a Working Day");
            break;
            case 2:
            System.out.println("The Day is Tuesday \nIt is a Working Day");
            break;
            case 3:
            System.out.println("The Day is Wednesday \nIt is a Working Day");
            break;
            case 4:
            System.out.println("The Day is Thursday \nIt is a Working Day");
            break;
            case 5:
            System.out.println("The Day is Friday \nIt is a Working Day");
            break;
            case 6:
            System.out.println("The Day is Saturday \nIt is a Weekend Day");
            break;
            case 7:
            System.out.println("The Day is Sunday \nIt is a Weekend Day");
            break;
            default:
            System.out.println("ERROR\nThe Number is more than 7 or less than 1");
            break;
        }
    }
}