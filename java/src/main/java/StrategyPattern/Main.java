package StrategyPattern;

import StrategyPattern.PayOptions.BankTransfer;
import StrategyPattern.PayOptions.CreditCardStrategy;
import StrategyPattern.PayOptions.PaypalStrategy;

public class Main {

		public static void main(String[] args) {

				PaypalStrategy ps = new PaypalStrategy("myemail@example.com", "mypwd");
				CreditCardStrategy cs = new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15");
				BankTransfer bankTransfer = new BankTransfer("Kevin Klein", "De1234567890123456", "12/15");
				new PaymentService(ps).getPayment(1111);
				new PaymentService(cs).getPayment(1222);
				new PaymentService(bankTransfer).getPayment(5555);
		}
}
