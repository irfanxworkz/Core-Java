package com.xworkz.assosiation.boot;
import com.xworkz.assosiation.things.Wallet;
import com.xworkz.assosiation.things.Money;
import com.xworkz.assosiation.things.Money;
public class WalletRunner {

	public static void main(String[] args) {
		System.out.println("inside main methods...");
		Wallet wallet=new Wallet("levis",3000,"leather");
		wallet.show();
		Money money = new Money("indian",78);
		wallet.init(money);
		wallet.show();
		System.out.println("outside the main methods...");

	}

}
