package Solid.sigleResponsible;

import java.math.BigDecimal;

public class TransactionOperations {
    private final AccountOperation accountOperations;

    // Dependency Injection via constructor
    public TransactionOperations(AccountOperation accountOperations) {
        this.accountOperations = accountOperations;
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount        the amount to deposit
     * @param accountNumber the account number
     */
    public void deposit(BigDecimal amount, int accountNumber) {
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAccount(account.getTotalAccount().add(amount));
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount        the amount to withdraw
     * @param accountNumber the account number
     */
    public void withdraw(BigDecimal amount, int accountNumber) {
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAccount(account.getTotalAccount().subtract(amount));
    }
}

