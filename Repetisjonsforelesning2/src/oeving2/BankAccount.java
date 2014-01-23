package oeving2;

public class BankAccount {
	
	String name;
	double balance;

	public void deposit (double amount){
		
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void transfer(BankAccount other, double amount) {
		if(transferfee()){
		withdraw(amount);
		other.deposit(amount);
		}
		
		
	}
	
	public boolean transferfee(){
		if(balance >= 5){
			return true;
		}
		else {return false;}
		
	}
	
	
	public String toString(){
		
		return name + " :" + balance;
	}
	
	public static void main(String[] args) {
		
		BankAccount bankkonto = new BankAccount();
		BankAccount bankkonto2 = new BankAccount();
		
		bankkonto.deposit(80);
		
		
		
		bankkonto.transfer(bankkonto2, 20);
	}
}
