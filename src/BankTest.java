
public class BankTest {

	public static void main(String[] args) {
		BankAccount pnc = new BankAccount("Antonia Meier",1000,50);
		System.out.println(pnc.toString());
		
		pnc.deposit(100);
		System.out.println(pnc.toString());
		pnc.withdrawl(300);
		System.out.println(pnc.toString());
		
		pnc.withdrawl(790);
		System.out.println(pnc.toString());
		
	}

}
