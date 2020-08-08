class newAccount
{   public static void main(String name, long accNum, String acc_type)
    {
        account my_account=new account(name, accNum, acc_type);
        account account=new account();
        my_account.startAccount(1000);
        my_account.deposit(500.00);
        my_account.withdraw(300);
    }
}