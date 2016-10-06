
package finance;

import finance.enums.CompoundingOption;

/**
 *
 * The LoanPayment class shall provide the following capabilities:
 * Calculate the periodic payment required to pay off a loan given the amount purchased, down
 * payment, interest rate (APR), compounding, and loan duration.
 * The periodic payment shall be provided by the getValue method (required of all classes that
 * inherit TVMEngine). The periodic payment shall be produced as text formatted as US currency. Produce a text summary report of the loan as shown in the example below:
 * The summary report shall be provided by the generateReport method required by the ReportGenerator interface.
 * 
 * @author skbriles | 127.0.0.1 Team
 */
public class LoanPayment extends TVMEngine {
        //Instance variables
        double purchaseAmount;
        double downPayment;
        double interestRate;
        double loanDuration;
        
        
    public LoanPayment() {
        super();
        
        purchaseAmount = 0;
        downPayment = 0;
        interestRate = 0;
        loanDuration = 0;
        
    }
    
    /**
     * The class constructor creates a LoanPayment object configured to
     * calculate a loan payment. The loan parameters are provided to the object
     * through the constructor.
     * @param purchaseAmount the amount of the purchase to be made by the borrower
     * @param downPayment the down payment to be made by the borrower against the purchase amount
     * @param interestRate the annual percentage rate (APR) to be applied to the loan.
     * @param compounding indicates how often interest is added to the loan principal.
     * @param loanDuration the duration of the loan in years
     */
    
    public LoanPayment (double purchaseAmount, double downPayment, double interestRate, CompoundingOption compounding, double loanDuration) {
        
        super();
        this.purchaseAmount = purchaseAmount;
        this.downPayment = downPayment;
        setCompounding(compounding);
        updateLoan();
        setAPR(interestRate);
        setYears(loanDuration);
    }
    
    // set Classes
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        updateLoan();
    }
    
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
        updateLoan();
    }    
    // get Classes
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    
    public double getDownPayment() {
        return downPayment;
    }
    
    /** Provides the periodic payment required to pay off the amount financed. The payment is provided as
     * text formatted as US currency
     * 
     * @return A String object representing the loan payment formatted as US currency rounded to two
     * decimal places
     **/
    
    @Override
    public String getValue() {
        return "null";
    }
    
   
    
     /**
     * Provides a text summary report of the loan. The report includes the amount purchased, down
     * payment, interest rate (APR), compounding, loan duration, and periodic payment.
     * 
     * @return A String object containing a summary of the loan parameters
     */

    public String print() {
        return toCurrency(-calcPMT());
    }
   
    private void updateLoan() {
        setPV(purchaseAmount - downPayment);
    }
}
