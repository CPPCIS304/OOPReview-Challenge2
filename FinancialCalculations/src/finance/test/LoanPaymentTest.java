/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance.test;

import finance.LoanPayment;
import finance.Report;
import finance.TVMEngine;
import finance.enums.CompoundingOption;

public class LoanPaymentTest {
  public static void main(String[] args) {
        System.out.println("Testing LoanPayment Class");
        System.out.println("\ngetValue () Test Case 1");
        LoanPayment loanPayment = new LoanPayment (350000, 0, 10,
                                               CompoundingOption.ANNUAL, 15);
        TVMEngine calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\ngetValue () Test Case 2");
        loanPayment = new LoanPayment (350000, 50000, 10,
                                       CompoundingOption.ANNUAL, 15);
        calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\netValue () Test Case 3");
        loanPayment = new LoanPayment (350000, 0, 10,
                                       CompoundingOption.SEMIANNUAL, 15);
        calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\ngetValue () Test Case 4");
        loanPayment = new LoanPayment (350000, 0, 10,
                                       CompoundingOption.QUARTERLY, 15);
        calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\ngetValue () Test Case 5");
        loanPayment = new LoanPayment (350000, 0, 10,
                                       CompoundingOption.MONTHLY, 15);
        calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\ngetValue () Test Case 6");
        loanPayment = new LoanPayment (350000, 0, 10,
                                       CompoundingOption.WEEKLY, 15);
        calculator = loanPayment;
        System.out.println("Payment getValue () result: " + calculator.getValue());

        System.out.println("\ngenerateReport () Test Case 1");
        loanPayment = new LoanPayment (350000, 50000, 10,
                                       CompoundingOption.ANNUAL, 15);
        Report report = loanPayment;
        System.out.println(report.print());

        System.out.println("\ngenerateReport () Test Case 2");
        loanPayment = new LoanPayment (350000, 50000, 10,
                                       CompoundingOption.MONTHLY, 15);
        report = loanPayment;
        System.out.println(report.print());
  }
}