public class SuspendedState implements AccountState{
    @Override
    public void withdraw(Account account, double withdrawAmount){
        System.out.println("You cannot deposit on a suspended account ");
    }
    @Override
    public void deposit(Account account, double depositAmount){
        System.out.println("You cannot withdraw on a suspended account ");
    }
    @Override
    public void activate(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("This account is already activated ");
    }
    @Override
    public void close(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed");
    }
    @Override
    public void suspend(Account account){
        System.out.println("Account is already suspended");
    }
}