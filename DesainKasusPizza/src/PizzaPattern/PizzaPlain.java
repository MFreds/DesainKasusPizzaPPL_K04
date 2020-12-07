package PizzaPattern;

public class PizzaPlain implements Pizza{
	
	@Override
	public String getDesc(){
		return "Plain Pizza(10p) \n";
	}
	public int getCost(){
		return 10;
	}
}
