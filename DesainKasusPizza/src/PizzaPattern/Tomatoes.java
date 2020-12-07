package PizzaPattern;

public class Tomatoes extends PizzaTopping{

	private Pizza pizza;

	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Tomat(1p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 1;
	}
}
