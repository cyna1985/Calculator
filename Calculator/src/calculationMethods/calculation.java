package calculationMethods;
import java.util.Scanner;

public class calculation {

	public final String (Float a, Float b, String sign) {
		final Program s = new Program ();
		
		  if (Program.sign.equals("*")) 
		  {
			  final Multiplication z = new Multiplication ();
			  result = z.multiply(a,b);
		  } 
		  else 
		  {
			  if (sign.equals("/"))
			  {
				  final Division z = new Division ();
				  result = z.div(a,b);
			  }
			  else
			  {
				  if (sign.equals("+"))
				  {
					  final Sum z = new Sum ();
					  result = z.sum(a,b);
				  }
				  else 
				  {
					  if (sign.equals("-"))
					  {
						  final Substraction z = new Substraction ();
						  result = z.sub(a,b);  
					  }
					  else {
						  System.out.println("You choose wrong operation");
					  }

				  }
			  }
			  
		  }
		  System.out.println("Your result is: " +result);
		  return result;
}

}
