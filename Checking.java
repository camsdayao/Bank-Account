/**
 * 
 */
package BANKACCOUNT;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author CamilleDayao
 * *@Description:  to write a bank account program that handles bank account balances for an array of bank accounts. 
 *@Datecreated: 05/31/2022
 */
public class Checking extends BankAccount{
	
	public Checking(double balance) {							
		super.balance =  balance;
		
		if(super.balance <0) {									//balance cannot be <0 initially
			super.balance =0;
		}
		else {
			super.balance = balance;
		}
	}	
	public void writeACheck(double checkBalance) {				//writeACheck method
		
		if(super.balance <0) {									//to set balance=0 if balance is <0
			balance =0;
		}
		balance = super.balance - checkBalance - 1;				// writeACheck method computation
	}

	@Override
	public String display() {									// display method
		Locale locale = new Locale("en", "US");
		NumberFormat curformat = NumberFormat.getCurrencyInstance(locale);		// convert format to locale format
		String formattedPrint = String.format("Checking account balance = %s", curformat.format(balance));
		System.out.println(formattedPrint);
		return null;
	}
}
