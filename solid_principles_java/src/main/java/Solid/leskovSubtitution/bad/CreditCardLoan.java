package Solid.leskovSubtitution.bad;

public class CreditCardLoan  implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
throw new UnsupportedOperationException("foreClose not allowed ");
    }

    @Override
    public void doRepayment(int amount) {
  throw new UnsupportedOperationException("unsupported doRepayment exception");
    }
}
