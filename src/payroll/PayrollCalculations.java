/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 * the purpose of this interface is an example of implementing an interface.  
 * They may do the same calculations but for this example we want to just 
 * define multiple methods.
 * @author lj
 */
public interface PayrollCalculations {
    
   public double calculcateGrossPay( int hoursWorked, double payRate );
   public double calculateFederalRate (double federalRate, double grossPay);
   public double calculateDeductions ( double finalFederalRate, double finalState );
   public double calculateStateRate (double taxRate, double grossPay );
   public double calculateNetPay (double grossPay, double deductions);
   
   
}
