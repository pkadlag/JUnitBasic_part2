
public class PalindromeNumber {

	public boolean isPalindrome(int i) {
		
		int result=0;
		int number=i;
		int reminder=0;
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			result=result*10+reminder;
			
		}
		
		if(result==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
