package PizzaPattern;

public class Peppers extends PizzaTopping{

	private Pizza pizza;

	public Peppers(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Peppers(2p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 2;
	}
}
