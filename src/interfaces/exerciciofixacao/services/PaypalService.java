package interfaces.exerciciofixacao.services;

public class PaypalService implements OnlinePaymentService {

    private static final double MONTHLY_INTEREST_RATE = 0.01;
    private static final double PAYMENT_FEE_RATE = 0.02;

    @Override
    public double paymentFee(double amount) {
        //aplica taxa de pagamento (2% em cima do valor com juros)
        return amount * PAYMENT_FEE_RATE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST_RATE * months;
    }
}
