package StrategyPattern.PayOptions;

import StrategyPattern.PaymentStrategy;

public class BankTransfer implements PaymentStrategy {

		private String name;
		private String iban;

		private String dateOfExpiry;

		public BankTransfer(String name, String iban, String expiryDate){
				this.name=name;
				this.iban=iban;
				this.dateOfExpiry=expiryDate;
		}
		@Override
		public void pay(int amount) {
				System.out.println(amount +" paid with Bank Transfer");
		}

}
