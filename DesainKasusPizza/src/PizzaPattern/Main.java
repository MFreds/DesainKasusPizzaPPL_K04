package PizzaPattern;

public class Main {

	public static void main(String[] args){
		Pizza pizza = new PizzaPlain();

		pizza = new Pineapple(pizza);
		pizza = new Pepperoni(pizza);
		pizza = new Bacon(pizza);
		pizza = new Peppers(pizza);
		pizza = new Onions(pizza);
		pizza = new Cheese(pizza);
		pizza = new Chicken(pizza);
		pizza = new Ham(pizza);
		pizza = new Mushrooms(pizza);
		pizza = new Olives(pizza);
		pizza = new Tomatoes(pizza);
		pizza = new Tuna(pizza);
		
		System.out.println("Pesanan Pizza :\n" + pizza.getDesc());
		System.out.println("Total Harga : " + pizza.getCost());
	}
}
