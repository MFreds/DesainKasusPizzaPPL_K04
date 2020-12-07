package PizzaPattern;

public class Ham extends PizzaTopping{
	
	private Pizza pizza;

	public Ham(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + "Topping Ham(5p) \n";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 5;
	}
}
