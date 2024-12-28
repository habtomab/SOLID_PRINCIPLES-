package Solid.leskovSubtitution.bad;

public class LoanClosureService {
private LoanPayment loanPayment;
public LoanClosureService(LoanPayment l){
    this.loanPayment=l;
}
    public void foreCloseLoan(){
        loanPayment.foreCloseLoan();
    }
}
