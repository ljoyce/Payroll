/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author lj
 */
import java.util.Scanner;
import java.text.*;

        

public class Payroll
{

    public static void main(String[] args) 
    {
       System.out.println("Payroll System");
       System.out.println();
      
       
       Scanner sc = new Scanner (System.in);
       PayrollCalculations payrollHelper = new PayrollHelper();
       
       
       System.out.print("Enter Employee's name:");
       String name = sc.nextLine(); 
       
       
       System.out.print("Enter number of hours worked in a week:");
       int hoursWorked = sc.nextInt(); 
       
       
       System.out.print("Enter hourly pay rate:");
       double payRate = sc.nextDouble(); 
       
       System.out.print("Enter federal tax withholding rate (for example:0.25):");
       double federalRate = sc.nextDouble();
       
       
       System.out.print("Enter state tax rate (for example: 0.07): ");
       double stateTaxRate = sc.nextDouble();
       
       double grossPay = payrollHelper.calculcateGrossPay( hoursWorked, payRate );
               
       
       
       double finalFederalRate = payrollHelper.calculateFederalRate(federalRate, grossPay);
       
       
       double finalStateRate = payrollHelper.calculateStateRate (stateTaxRate, grossPay);
       
       double totalDeductions = payrollHelper.calculateDeductions(finalFederalRate, finalStateRate);
       
       NumberFormat currency = NumberFormat.getCurrencyInstance();
       NumberFormat percent = NumberFormat.getPercentInstance();
       
       double netPay = payrollHelper.calculateNetPay(grossPay, totalDeductions);
       
       
       System.out.println();
       
       
       System.out.println("Employee Name: " + name);
       
       System.out.println("Hours Worked: " + hoursWorked);
       //int hoursWorked = sc.nextInt();
       
       System.out.println("Pay Rate: " + payRate);
       //int rate = sc.nextInt();
       
       System.out.println("Gross Pay: " + grossPay);
       
       
       System.out.println();
       
       System.out.print("Deductions:");
       
       System.out.println();
       
       System.out.println("Federal Withholding: " + "(" + percent.format (federalRate) + ")" + "\t" + currency.format(finalFederalRate));
       System.out.println("State Withholding: " + "\t" + currency.format(finalStateRate));
       System.out.println("Total Deductions: " + "\t" +  currency.format(totalDeductions));
       
       System.out.println();
       System.out.println("Net Pay:" + netPay);
               
    }

}