import java.util.Scanner;

public class Food implements IVendingMachine{
	
	
	// Objects and Variables
	Scanner input=new Scanner(System.in);
	public int usermoney,price;	
	public int[] money= {1,5,10,20,50,100,500,1000};
	public String productname,validation;
	public Food[] foodlist= new Food[10];
	int counter=0;
	String userinput;
	
	public void ChooseProduct()
	{
		if(this.productname.equalsIgnoreCase("Pepsi"))
		{
			Food pepsiObject=new Pepsi("Pepsi"
					,"this product validate until (2018-01-21)"
					,50);
			
				foodlist[counter]=pepsiObject;
				counter++;
		}
			else if(productname.equalsIgnoreCase("hamburger"))
			{
				Food hamburgerObject=new Hamburger("Hamburger"
						,"this product validate until 10 days"
						,500);
				
					foodlist[counter]=hamburgerObject;
					counter++;
			}
				else if(productname.equalsIgnoreCase("gum"))
				{
					Food gumObject=new Gum("Gum"
							,"this product validate until 1 year from the date of the purchase"
							,1);
					
					foodlist[counter]=gumObject;
					counter++;
				}
	}
	
	
	public void PrintProductdetails() {
		
		System.out.println(foodlist[0].productname+ " cost: " +foodlist[0].price);
		System.out.println("validation: "+foodlist[0].validation);
		System.out.println("Do you want to buy it?(y/n)");
		userinput=input.nextLine();
	}
	
	public void CheckPurchase(Money Object) {
		if(this.userinput.equalsIgnoreCase("y"))
		{
			if(Object.usermoney>=foodlist[0].price)
			{
			this.usermoney=Object.usermoney-foodlist[0].price;
			System.out.println("take your product!");
			System.out.println("your balance:"+usermoney);
			}
				else if(this.usermoney<foodlist[0].price)
				{
					System.out.println("you don't have enogh money for purchase!");
				}
		
		}
		
}
	//Setters and Getters


	public String getValidation() {
		return this.validation;
	}
	
	public int getUserMoney() {
		return usermoney;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}
