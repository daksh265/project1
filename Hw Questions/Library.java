//This Program prints The Accesion no., Author and the title 
//It also calculates the fine and displays it by taking the input of the days delayed 
class Library
{
    int acc_num;String tittle;String author; double fine;
    void input(int acc_no,String Tittle,String Author)
    {
        acc_num = acc_no;
        tittle = Tittle ;
        author = Author ;
      }
    void compute(int days_delayed)
    {
        fine = days_delayed*2.0; //Formula for calculating the fine is given in the question
        System.out.println("The fine is equal to "+ fine);
    }
    void display()
    {
         System.out.println("Accestion Number \t Author \t Tittle ");
         System.out.println(acc_num +"\t  "+author +"\t   "+ tittle);
    }
    public static void main()
     {
        Library obj = new Library();
        obj. input(12345678,"Harry Potter","J.K Rowling");
        obj. compute(5); 
        obj. display();
    }
}