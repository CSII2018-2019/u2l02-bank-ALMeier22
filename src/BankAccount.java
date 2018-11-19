import javax.swing.JOptionPane;

public class BankAccount {
	
	private String name;
	private double balance;
	private double lowBalance;
	
	// constructor
	
	public BankAccount(String name, double balance, double lowBalance) {
		setName(name);
		setBalance(balance);
		setLowBalance(lowBalance);
	}

	public BankAccount(String name, double balance) {
		setName(name);
		setBalance(balance);
		setLowBalance(100);
	}

	//setter getter
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	private void setBalance(double newBalance) {
		balance = newBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setLowBalance(double newLowBalance) {
		lowBalance = newLowBalance;
	}
	
	public double getLowBalance() {
		return lowBalance;
	}
	
	// methods
	
	public void deposit(double amount) {
		if(amount > 0) {
			setBalance(getBalance()+amount);
		}
		else {
			JOptionPane.showMessageDialog(null, "Amount needs to be positive");
		}
	}
	
	public void withdrawl(double amount) {
		if(amount > 0) {
			if(getBalance()-amount < getLowBalance()) {
				String answer = JOptionPane.showInputDialog ("You have only $" + getBalance() + ". Are you sure you want to withdraw $"+amount+" (yes/no)?");
				if(answer.equalsIgnoreCase("yes")) {
					setBalance(getBalance()-amount);
				}
			}
			else {
				setBalance(getBalance()-amount);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Amount needs to be positive");
		}
	}
	
	public String toString() {
		return getName() + "’s account holds $"+getBalance()+" with a lowest balance allowable of $" + getLowBalance();
	}
}
