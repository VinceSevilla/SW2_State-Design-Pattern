public class ActiveState implements AccountState{
    @Override
    public void withdraw(Account account, double withdrawAmount){
        account.setBalance((account.getBalance()) + withdrawAmount);
        System.out.println("Deposit, " + withdrawAmount + ". " + account);
    }
    @Override
    public void deposit(Account account, double depositAmount){
        account.setBalance((account.getBalance()) - depositAmount);
        System.out.println("Withdraw, " + depositAmount + ". " + account);
    }
    @Override
    public void activate(Account account){
        System.out.println("This account is already activated ");
    }
    @Override
    public void close(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed");
    }
    @Override
    public void suspend(Account account){
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended");
    }
}