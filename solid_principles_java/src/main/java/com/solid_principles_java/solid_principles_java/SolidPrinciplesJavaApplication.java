package com.solid_principles_java.solid_principles_java;

import Solid.openClose.AddOperation;
import Solid.openClose.Calculate;
import Solid.sigleResponsible.Account;
import Solid.sigleResponsible.AccountOperation;
import Solid.sigleResponsible.TransactionOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SolidPrinciplesJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidPrinciplesJavaApplication.class, args);
		// 1 Single Responsible
		// tha is responsible for one operation responsible
		// Create an account object
		Account account = new Account();
		account.setAccountNumber(123);
		account.setFirstName("Vishrut");
		account.setTotalAccount(BigDecimal.valueOf(100000));
		// Perform account operations
		AccountOperation accountOperations = new AccountOperation();
		accountOperations.addAccount(account);
		// Perform transaction operations
		TransactionOperations transactionOperations = new TransactionOperations(accountOperations);
		transactionOperations.deposit(BigDecimal.valueOf(123), account.getAccountNumber());
		// 2 Open Close

		AddOperation addOperation= new AddOperation();
		Calculate calculate= new Calculate();
		int res= calculate.calculateNumber(5,9,addOperation);
		System.out.println("tesing.................");
		System.out.println(res);
		//3 leskove  parent and sub parent class should be intergengiable or substitutable

		//4 Interface segregation a client does not forced to implement all methods existing in interface class
	// 5 higher module should not depend on lower module Both depend on abstraction eg interface
	}

}
