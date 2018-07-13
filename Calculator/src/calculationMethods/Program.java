package calculationMethods;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Put numbers");
		  float a,b,result = 0;
		  Scanner read = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		  a = read.nextFloat();
		  b = read.nextFloat();
		  System.out.println("Your choice is \n" + "a: " +a + "\n" + "b: " +b); //wyœwietlamy powitanie
		  System.out.println("What operation You would like to execute? \n + - * /");
		  String sign = read.next();
		  final calculation calc = new calculation ();
		  calc.String (a,b,sign);
	}

}
