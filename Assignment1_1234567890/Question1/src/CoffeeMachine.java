
public class CoffeeMachine {
	private int numCups;
	private int temperature;
	
	public CoffeeMachine() {
		numCups=10;
		temperature=70;
	}
	//get temperature
	public int getTemp() {
		return temperature;
	}
	//use a cup to get a cup of coffee
	public void getCoffee() {
		if(numCups==0) {
			System.out.println("You cannot get coffee as there are no cups.");
		}else {
			numCups--;
			
		}
	}
	//add cups to coffee machine
	public void addCups() {
		if(numCups==0) {
			//Add 10 new cups to the coffee machine
			//If the current number of cups inside the machine is zero.
			numCups=10;
		}else {
			System.out.println("Not enough space to add cups!");
		}
	}
	// Decrease the temperature of the coffee by 10 degrees. 
	// The temperature of the coffee cannot go below 50 degrees.
	public void cooler() {
		if(temperature > 50) {
			temperature -= 10;
		}
	}
	// Increase the temperature of the coffee by 10 degrees. 
	//The temperature of the coffee cannot go above 90 degrees.
	public void hotter() {
		if(temperature < 90) {
			temperature += 10;
		}
	}
	//set temperature
	public void setTemp(int newTemp) {
		if(newTemp < 50 || newTemp > 90) {
			System.out.println("Temperature " + newTemp + " must be between 50 and 90!");
		} else {
			if(newTemp % 10 != 0) {
				System.out.println("Temperature " + newTemp + " must be a multiple of 10!");
			} else {
				temperature = newTemp;
			}
		}
	}
	
	//test
	public static void testCoffeeMachine() {
		CoffeeMachine cm = new CoffeeMachine();
		
		System.out.println(cm.getTemp() == 70);
		cm.addCups(); // Cannot add cups.
		System.out.println(cm.getTemp() == 70); // Nothing changed.
		// Get 10 cups of coffee:
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.addCups(); // Cannot add cups with 5 cups less.
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee(); // Cannot get coffee because no cups.
		cm.addCups(); // Adding 10 cups, so we can get 10 coffees again:
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee();
		cm.getCoffee(); // Cannot get coffee again because no cups.
		System.out.println(cm.getTemp() == 70);
		cm.cooler();
		System.out.println(cm.getTemp() == 60);
		cm.cooler();
		System.out.println(cm.getTemp() == 50);
		cm.cooler(); // Does nothing.
		System.out.println(cm.getTemp() == 50);
		cm.hotter();
		System.out.println(cm.getTemp() == 60);
		cm.hotter();
		System.out.println(cm.getTemp() == 70);
		cm.hotter();
		System.out.println(cm.getTemp() == 80);
		cm.hotter();
		System.out.println(cm.getTemp() == 90);
		cm.hotter(); // Does nothing.
		System.out.println(cm.getTemp() == 90);
		cm.setTemp(49); // Not between 50 and 90.
		System.out.println(cm.getTemp() == 90);
		cm.setTemp(50);
		System.out.println(cm.getTemp() == 50);
		cm.setTemp(91); // Not between 50 and 90.
		System.out.println(cm.getTemp() == 50);
		cm.setTemp(90);
		System.out.println(cm.getTemp() == 90);
		cm.setTemp(75); // Between 50 and 90 but not a multiple of 10.
		System.out.println(cm.getTemp() == 90);
		cm.setTemp(70);
		System.out.println(cm.getTemp() == 70);
	}
}




