package PizzaPattern;

public class Pepperoni extends PizzaTopping{

	private Pizza pizza;

	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Pepperoni(4p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 4;
	}
}
