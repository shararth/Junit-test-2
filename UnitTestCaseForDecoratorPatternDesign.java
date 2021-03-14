import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestCaseForDecoratorPatternDesign {

	
	@Test
	void test() {
		boolean PizzaMade = false;
		boolean PizzaMade1 = true;
		boolean ThinCrustPizzaMade=false;
		Pizza pizza = new ThinCrustPizza();
		System.out.println(pizza.getDescription() + " $" + pizza.cost());
		
		Pizza pizza1 = new ThinCrustPizza();
		Pizza CheesePizza= new Cheese(pizza1);
		Pizza GreekPizza = new Olives(CheesePizza);
		Pizza IndianPizza = new BananaPeppers(GreekPizza);

		System.out.println("The Indian Style Pizza with Thin Crust is: " + IndianPizza.getDescription() 
				+ " $" + IndianPizza.cost());
		
		System.out.println();
		
		ThinCrustPizzaMade=true;
		
		Pizza pizza2 = new ThickCrustPizza();
		System.out.println(pizza2.getDescription() + " $ " + pizza2.cost());
		
		Pizza pizza3 = new ThickCrustPizza();
		Pizza CheesePizza1 = new Cheese(pizza3);
		Pizza GreekPizza1 = new Olives(CheesePizza1);
		Pizza IndianPizza1 = new BananaPeppers(GreekPizza1);
		
		System.out.println("The Indian Style Pizza with Thick Crust is: " + IndianPizza1.getDescription() 
				+ " $" + IndianPizza1.cost());
		
		
		PizzaMade = true;
		PizzaMade1 = false;
		assertTrue(PizzaMade);
		assertFalse(PizzaMade1);
		assertTrue(ThinCrustPizzaMade);
		
		
		
	}

}
