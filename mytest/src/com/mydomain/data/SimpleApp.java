package com.mydomain.data;

import java.util.List;

import com.mydomain.domain.Account;
import com.mydomain.domain.Address;


public class SimpleApp {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Account account = null;
//		Address add = new Address();
//		for (int i = 0; i < 5; i++) {
//			add.setId(i);
//			add.setAccountId(1);
//			add.setAddresses("tibakennmatudomabasi305"+i);
//			AddressOperator.insertAddress(add);
//		}

//		Account accView;
//		accView = SimpleExample.selectAccountById(1);
//		System.out.println(accView.getId() + "+" +accView.getFirstName());

//		List<Address> list = AddressOperator.selectAddressByAccountId(1);
//		for (Address add : list) {
//			System.out.println(add.getId() + "+" +add.getAddresses());
//		}

		AccountAddress accountAddress = new AccountAddress();

		List<Account> accountList = accountAddress.selectAllAccountAddress();


		for (int i = 0; i < accountList.size(); i++) {
			account = (Account) accountList.get(i);
			System.out.println(account.getFirstName());

			for (Address address:account.getAddressSet()) {
				System.out.println(address.toString());
			}
		}

	}

}
