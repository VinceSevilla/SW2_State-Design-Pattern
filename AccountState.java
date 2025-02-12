public interface AccountState{
    void withdraw(Account account, double withdrawAmount);
    void deposit(Account account, double depositAmount);
    void activate(Account account);
    void close(Account account);
    void suspend(Account account);
}