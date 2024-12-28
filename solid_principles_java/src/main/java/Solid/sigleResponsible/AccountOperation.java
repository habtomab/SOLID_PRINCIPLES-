package Solid.sigleResponsible;

import java.util.*;

public class AccountOperation {
    private Map<Integer,Account> accountMap= new HashMap<>() ;

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }
    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }
    public void deposite(int amount,int accountNumber){

    }
}
