package application;

public class Calculator {
	
	static double add(String text1, String text2) {
		double sum = Double.parseDouble(text1)+Double.parseDouble(text2);
		return sum;
	}

	static double sub(String text1, String text2) {
		double difference=Double.parseDouble(text1)-Double.parseDouble(text2);
		return difference;
	}
	
	static double div(String text1, String text2) {
		double quotient=0;
		if (Double.parseDouble(text2) != 0)
			quotient=Double.parseDouble(text1)/Double.parseDouble(text2);
		else 
			System.out.println("You cannot divide by zero");
		return quotient;
	}
	
	static double multi(String text1, String text2) {
		double product=Double.parseDouble(text1)*Double.parseDouble(text2);
		return product;
	}
}
