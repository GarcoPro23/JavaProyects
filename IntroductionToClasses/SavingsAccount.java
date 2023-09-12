public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance=initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+balance);
    }
    public void deposit(int amountToDeposit){
        balance=amountToDeposit+balance;
        System.out.println("You just deposited "+ amountToDeposit);
    }
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        return amountToWithdraw;
    }
    public String toString(){
        return "This is a savings account with " + balance +" saved.";
    }

    public static void main(String[]args){
        SavingsAccount savings= new SavingsAccount(2000);
        //CHECK BALANCE:
        savings.checkBalance();
        //WITHDRAWING:
        savings.withdraw(300);
        //CHECK BALANCE:
        savings.checkBalance();
        //DEPOSIT:
        savings.deposit(600);
        //CHECK BALANCE:
        savings.checkBalance();
        //DEPOSIT:
        savings.deposit(600);
        //CHECK BALANCE:
        savings.checkBalance();

        System.out.println(savings);
    }
}