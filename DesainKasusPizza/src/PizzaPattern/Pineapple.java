package PizzaPattern;

public class Pineapple extends PizzaTopping {

	private Pizza pizza;

	public Pineapple(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Pineapple(2p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 2;
	}
}
