import java.util.Scanner;

public class UI extends Food{

	//Variables and Objects>>

	String productname;
	//Starting of the Machine>>

	public void CheckProductInput() {
		System.out.println("Choose a product:\nHamburger  Pepsi  Gum");
		super.productname=input.nextLine();
		
		if((super.productname.equalsIgnoreCase("hamburger")) 
			|| (super.productname.equalsIgnoreCase("pepsi")) 
				|| (super.productname.equalsIgnoreCase("gum")))
			{	

			}
		else {
			System.out.println("Invalid input!!");
			CheckProductInput();
		}
		
	}
	


}
