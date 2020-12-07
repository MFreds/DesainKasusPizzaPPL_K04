package PizzaPattern;

public class Chicken extends PizzaTopping {

	private Pizza pizza;

	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Chicken(5p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 5;
	}
}
