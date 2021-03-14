
public class PizzaPalace {

	public static void main(String[] args) {
		Pizza pizza = new ThinCrustPizza();
		System.out.println(pizza.getDescription() + " $" + pizza.cost());
		
		Pizza pizza1 = new ThinCrustPizza();
		Pizza CheesePizza= new Cheese(pizza1);
		Pizza GreekPizza = new Olives(CheesePizza);
		Pizza IndianPizza = new BananaPeppers(GreekPizza);

		System.out.println("The Indian Style Pizza with Thin Crust is: " + IndianPizza.getDescription() 
				+ " $" + IndianPizza.cost());
		
		System.out.println();
		
		Pizza pizza2 = new ThickCrustPizza();
		System.out.println(pizza2.getDescription() + " $ " + pizza2.cost());
		
		Pizza pizza3 = new ThickCrustPizza();
		Pizza CheesePizza1 = new Cheese(pizza3);
		Pizza GreekPizza1 = new Olives(CheesePizza1);
		Pizza IndianPizza1 = new BananaPeppers(GreekPizza1);

		System.out.println("The Indian Style Pizza with Thick Crust is: " + IndianPizza1.getDescription() 
				+ " $" + IndianPizza1.cost());
		
		

	}

}
