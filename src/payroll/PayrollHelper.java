/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author lj
 */
public class PayrollHelper implements PayrollCalculations {
    
   
   @Override
   public double calculcateGrossPay( int hoursWorked, double payRate )
   {
       return hoursWorked * payRate;
   }
   
   @Override
   public double calculateFederalRate (double federalRate, double grossPay)
   {
       return federalRate * grossPay;
   }
   
   @Override
   public double calculateDeductions ( double finalFederalRate, double finalState )
   {
       return finalFederalRate + finalState;
       
   }
   
   @Override
   public double calculateStateRate (double taxRate, double grossPay )
   {
       return taxRate * grossPay;
   }
   
   @Override
   public double calculateNetPay (double grossPay, double deductions)
   {
        return grossPay - deductions;
    }
}
