public class ClosedState implements AccountState{
    @Override
    public void withdraw(Account account, double withdrawAmount){
        account.setBalance((account.getBalance()) + withdrawAmount);
        System.out.println("You cannot deposit on a closed account ");
    }
    @Override
    public void deposit(Account account, double depositAmount){
        account.setBalance((account.getBalance()) - depositAmount);
        System.out.println("You cannot withdraw on a closed account ");
    }
    @Override
    public void activate(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("You cannot activate a closed account ");
    }
    @Override
    public void close(Account account){
        System.out.println("Account is already closed" + account);
    }
    @Override
    public void suspend(Account account){
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended" + account);
    }
}