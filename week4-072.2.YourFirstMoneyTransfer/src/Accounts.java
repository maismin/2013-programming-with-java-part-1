
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account myAccount = new Account("My account", 0);
        Account mattAccount = new Account("Matt's account", 1000);
        
        double amount = 100.00;
        
        mattAccount.withdrawal(amount);
        myAccount.deposit(amount);
        
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }

}
