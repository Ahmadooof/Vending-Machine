

public class main {

	public static void main(String[] args) {
		
		//Objects and Variables
		
		Money MoneyObject=new Money();
		UI uiObject=new UI();
		Food FoodObject=new Food();
		Hamburger ObjectHam=new Hamburger();
	
		//Starting the machine
		uiObject.CheckProductInput();
		MoneyObject.CheckForMoney();
		uiObject.ChooseProduct();
		uiObject.PrintProductdetails();
		uiObject.CheckPurchase(MoneyObject);
	}

}