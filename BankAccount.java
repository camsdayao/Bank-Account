/**
 * 
 */
package BANKACCOUNT;

/**
 * @author CamilleDayao
 *@Description:  to write a bank account program that handles bank account balances for an array of bank accounts. 
 *@Datecreated: 05/31/2022
 */
public abstract class BankAccount {					//abstract class

	public double balance;
	
	public BankAccount() {							//instance variable
		
	}
	
	public void deposit(double deposit) {			//deposit method
		this.balance = balance + deposit;
	}
	
	public void withdraw(double withdraw) {			//withdraw method
		this.balance = balance - withdraw;
		if(balance <0) {							//to set balance=0 if balance is <0
			balance =0;
		}
	}
	
	public abstract String display();				//abstract display method

	}
	



