
package finance;

import finance.Investment;
import finance.enums.CompoundingOption;

/**
 *
 * @author 127.0.0.1 Team
 */

public class LoanPayment {
        double purchaseAmount;
        double downPayment;
        double interestRate;
        CompoundingOption compounding;
        double loanDuration;
        
    /**
    * The class constructor creates a LoanPayment object configured to calculate a loan payment. 
    * Two constructors shall be provided - one without parameters and one with parameters. 
    * When parameters are used, the loan parameters are provided to the object through the constructor.
    */
        
    public LoanPayment() {
        double purchaseAmount = 0;
        double downPayment = 0;
        double interestRate = 0;
        CompoundingOption compounding;
        double loanDuration = 0;
        
    }
    
    public LoanPayment (double purchaseAmount, double downPayment, double interestRate, CompoundingOption compounding, double loanDuration) {
        this.purchaseAmount = purchaseAmount;
        this.downPayment = downPayment;
        this.interestRate = interestRate;
        
        this.loanDuration = loanDuration;
    }
    
    public void setPurchaseAmount() {
     
    }
    
    public void setDownPayment() {
        
    }
    public double getPurchaseAmount() {
        return 0;
    }
    
    public double getDownPayment() {
        return 0;
    }
    
    public String getValue() {
        return "null";
    }
    
    public String print() {
        return "null";
    }
}
