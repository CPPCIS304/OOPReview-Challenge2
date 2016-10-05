/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;
import finance.enums.CompoundingOption;
/**
 *
 * @author skbriles | 127.0.0.1 Team
 */
public class Investment {
   
    //Instance Variable
    double initialInvestment;
    double periodicInvestment;
    
    /**
     * The class constructor creates an Investment object configured to calculate future value of an investment
     * 
     */
    
   public Investment() {
       // not sure if we use "super();" it is define as calling a constructor of product superclass
       initialInvestment = 0;
       periodicInvestment = 0;
   }
    /**
     * The class constructor creates an Investment object configured to calculate future value of an investment
     * @param initialInvestment the amount invested at the beginning of the investment term
     * @param periodicInvestment the amount invested at regular intervals over the length of the investment
     * @param interestRate the return on the investment. This parameter is expressed as an annual percentage rate (APR).
     * @param compounding indicates how often interest is added to the value of the investment.
     * @param yearsInvested the length of time the investment is made in years
     */
   
   public Investment (  double initialInvestment,
                        double periodicInvestment,
                        double interestRate,
                        CompoundingOption compounding,
                        double yearsInvested) {
       
       this.initialInvestment = initialInvestment;
       this.periodicInvestment = periodicInvestment;
       //have "set" statement  for  IR, COM, YR, IT,PT
       //setCompounding(compounding);
       
        }
   /**
    * Sets the initial investment
    * @param initialInvestment the amount invested at the beginning of the investment term
    */
   public void setIinitialInvestment(double initialInvestment){
       this.initialInvestment = initialInvestment;
       
   }
   
   public void setPeriodicInvestment(double periodicInvestment) {
       this.periodicInvestment = periodicInvestment;
       
   }
   
   public double getInitialInvestment() {
       return initialInvestment;
   }
   
   public double getPeriodicInvestment() {
       return periodicInvestment;
   }
   
   public String getValue() {
       return " ";
   }
   
   public String print() {
       return " ";
   }
}
