package Solid.leskovSubtitution.good;

public class LoanCloserService  {
    private SecureLoan secureLoan;
    public LoanCloserService(SecureLoan s){
        this.secureLoan=s;
    }
    public void foreCloseLoan(){
        secureLoan.forecloseLoan();
    }
}
