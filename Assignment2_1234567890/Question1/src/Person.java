
public class Person {
	private String name;
	private BankAccount account;
	private Motorcycle motorcycle;
	//constructor
	public Person(String name, int money, Motorcycle motorcycle) {
		this.name = name;
		// When a person is created, 
		//the person automatically gets a new bank account with the right amount of money in the account,
		//and a motorcycle.
		account = new BankAccount(money);
		this.motorcycle = motorcycle;
	}
	//returns a string describing the person and its possessions
	public String getDescr() {
		return name + " has " + account.getMoney() + " yuans and a " + motorcycle.getColor()
		+ " motorcycle with "+ motorcycle.getGasoline() + " liters of gasoline";
	}
	//
	public void changeMotorcycle(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}
	//a person to buy gasoline using money from the bank account of the person
	public void buyGasoline(int money) {
		if(money <= account.getMoney()) {
			account.setMoney(account.getMoney() - money);
			motorcycle.addGasoline(money / 8);
		}
	}
	public static void testPerson() {
		// Test for constructor of Person 
		// Mr. Li has 16 yuans and a blue motorcycle with 2 liters of gasoline.
		Motorcycle m = new Motorcycle("blue", 2);
		Person li = new Person("Mr. Li", 16, m);
		// Test getDescr.
		System.out.println(li.getDescr().equals("Mr. Li has 16 yuans and a blue motorcycle with 2 liters of gasoline"));
		// Test changeMotorcycle.
		li.changeMotorcycle(new Motorcycle("red", 5));
		System.out.println(li.getDescr().equals("Mr. Li has 16 yuans and a red motorcycle with 5 liters of gasoline"));
		// Test buyGasoline.
		li.buyGasoline(100);
		System.out.println(li.getDescr().equals("Mr. Li has 16 yuans and a red motorcycle with 5 liters of gasoline"));
		li.buyGasoline(8);
		System.out.println(li.getDescr().equals("Mr. Li has 8 yuans and a red motorcycle with 6 liters of gasoline"));
		li.buyGasoline(8);
		System.out.println(li.getDescr().equals("Mr. Li has 0 yuans and a red motorcycle with 7 liters of gasoline"));
		li.buyGasoline(1);
		System.out.println(li.getDescr().equals("Mr. Li has 0 yuans and a red motorcycle with 7 liters of gasoline"));

	}

}
