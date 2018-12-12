
public class CalculateDiscount 
{
	public static void main(String[] args) 
	{

		int newItem=100;
		float discount=(float) 0.35;
		float newItemPrice;
		
		newItemPrice=newItem-(newItem*discount);
		System.out.println("newItemPrice:");
		System.out.println(newItemPrice);
	}
}
