/**
 * 
 */
package BANKACCOUNT;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author CamilleDayao
 **@Description:  to write a bank account program that handles bank account balances for an array of bank accounts. 
 *@Datecreated: 05/31/2022
 */
public class Savings extends BankAccount{
	
	private double intRate;										//instance variable

	public Savings(double balance, double intRate) {
		super.balance = balance;
		this.intRate = intRate;	
		
		if(super.balance <0) {									//balance cannot be <0 initially. else set balance =0
			super.balance =0;
		}
		else {
			this.balance = balance;
		}
	}

	
	public double addInterest() {									//add interest method
		if(super.balance <=0) {										//to set balance=0 if balance is <0
			balance =0;
	}
		double newIntRate = super.balance * intRate;				// addinterest method computation 
		balance = super.balance + newIntRate;
		return balance;
	}
	

	@Override
	public String display() {
		Locale locale = new Locale("en", "US");
		NumberFormat curformat = NumberFormat.getCurrencyInstance(locale);		// convert format to locale format
		String formattedPrint = String.format("Savings account balance = %s", curformat.format(balance));
		System.out.println(formattedPrint);
		return null;
	}
}

