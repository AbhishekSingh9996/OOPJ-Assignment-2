class Account{
	int accountNumber;
	String holderName;
	double balance;
	double interest;
	
	Account(){
		
	}	
	Account(int accountNumber, String holderName, double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	public void printDetails(){
		System.out.println("Account number : " +accountNumber);
		System.out.println("Account Holder number : " +holderName);
		System.out.println("Account Balance : " +balance);
		System.out.println("Interest : " +interest);
	}
}
 
class SavingsAccount extends Account{
	double interestRate = 0;	
	SavingsAccount(int accountNumber, String holderName, double balance, double interestRate){
		super(accountNumber, holderName,balance);
		this.interestRate = interestRate;
		calculateYearlyInterest();
	}
	public void calculateYearlyInterest(){
		this.interest = (balance*1*interestRate)/100;
		printDetails();
	}
}

class CurrentAccount extends Account{
	CurrentAccount(int accountNumber, String holderName, double balance){
		super(accountNumber, holderName,balance);
		printDetails();
	}
}

public class Manager{
	public static void main(String [] args){
		SavingsAccount s1 = new SavingsAccount(123,"ABC",3000,1.5);
		SavingsAccount s2 = new SavingsAccount(234,"EFG",6000,2.5);
		CurrentAccount c1 = new CurrentAccount(123,"IJK",9000);
		CurrentAccount c2 = new CurrentAccount(234,"MNO",12000);
		CurrentAccount c3 = new CurrentAccount(345,"QRS",15000);
	}
}
 