
public class Money extends Food{
	
	
	//Variables and Objects>>
	
	
	//checking for the amount of money

	public void CheckForMoney() {
		int counter=0;
		System.out.print("put your money in machine:");
		super.usermoney=input.nextInt();
		for(counter=0;counter<money.length;counter++)
		{	
			if(super.usermoney==money[counter])
			{
				super.usermoney=money[counter];
				counter=10;
			}
		}
		if(counter==8)
		{
			System.out.println("You can put one of this"
					+" denominations{1kr,5kr,10kr,"
					+ "20kr,50kr,100kr,500kr,1000kr");
			CheckForMoney();
		}
	}
	
}
