package HelloWorld;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int firstnumber = input.nextInt();
		
		System.out.print("Enter the second number:");
		int secondnumber = input.nextInt();
		
		int sum = firstnumber + secondnumber;
		
		System.out.print("Sum of "+firstnumber+" and "+secondnumber+" is:"+sum);
		
		input.close();
	}

}
