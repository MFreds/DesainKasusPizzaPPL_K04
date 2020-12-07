package PizzaPattern;

public class Olives extends PizzaTopping {

	private Pizza pizza;

	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Olives(4p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 4;
	}
}
