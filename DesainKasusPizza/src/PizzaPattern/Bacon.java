package PizzaPattern;

public class Bacon extends PizzaTopping{

	private Pizza pizza;

	public Bacon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Bacon(5p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 5;
	}
}
