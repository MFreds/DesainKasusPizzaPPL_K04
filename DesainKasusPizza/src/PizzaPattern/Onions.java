package PizzaPattern;

public class Onions extends PizzaTopping{

	private Pizza pizza;

	public Onions(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Onions(3p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 3;
	}
}
