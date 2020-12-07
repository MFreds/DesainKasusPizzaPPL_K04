package PizzaPattern;

public class Tuna extends PizzaTopping{

	private Pizza pizza;

	public Tuna(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Tuna(4p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 4;
	}
}
