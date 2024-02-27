package StrategyPattern;

public class PaymentService {
		private PaymentStrategy paymentStrategy;

		public PaymentService(PaymentStrategy paymentStrategy) {
				this.paymentStrategy = paymentStrategy;
		}

		public void getPayment(int amount) {
				paymentStrategy.pay(amount);

		}

}
