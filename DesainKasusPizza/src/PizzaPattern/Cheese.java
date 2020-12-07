package PizzaPattern;

public class Cheese extends PizzaTopping {
	private Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Cheese(1p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 1;
	}
}
