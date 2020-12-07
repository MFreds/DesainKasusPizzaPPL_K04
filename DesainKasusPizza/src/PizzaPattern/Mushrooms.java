package PizzaPattern;

public class Mushrooms extends PizzaTopping{

	private Pizza pizza;

	public Mushrooms(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Mushroom(3p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 3;
	}
}
