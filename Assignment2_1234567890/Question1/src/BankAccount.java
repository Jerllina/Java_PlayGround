
public class BankAccount {
	private int money;
	//constructor
	public BankAccount(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public static void testBankAccount() {
		// Test for constructor.
		BankAccount b = new BankAccount(100);
		// Test getMoney.
		System.out.println(b.getMoney() == 100);
		// Test setMoney.
		b.setMoney(23);
		System.out.println(b.getMoney() == 23);
	}

}
