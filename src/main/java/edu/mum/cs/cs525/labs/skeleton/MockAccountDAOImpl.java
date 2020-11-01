package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAOImpl implements AccountDAOFactory {
	Collection<Account> accountList = new ArrayList<Account>();

	public void saveAccount(Account account) {
		System.out.println("Mock account DAO");
		accountList.add(account); // add the new
	}

	public void updateAccount(Account account) {
		System.out.println("Mock account DAO");
		Account accountExist = loadAccount(account.getAccountNumber());
		if (accountExist != null) {
			accountList.remove(accountExist); // remove the old
			accountList.add(account); // add the new
		}

	}

	public Account loadAccount(String accountNumber) {
		System.out.println("Mock account DAO");
		for (Account account : accountList) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		System.out.println("Mock account DAO");
		return accountList;
	}

}
