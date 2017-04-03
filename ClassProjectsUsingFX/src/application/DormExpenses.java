package application;

public class DormExpenses {
		
	public static double housing(String housing, String expenses){
		double housingCost = Double.parseDouble(housing)+(Double.parseDouble(expenses)*9);
		return housingCost;
	}

	public static double credits(String cost, String credit){
		double creditCost=Double.parseDouble(cost)*Double.parseDouble(credit);
		return creditCost;
	}
	
	public static double totalCosts(String supplies, double housingCost, double creditCost){
		double total=housingCost+Double.parseDouble(supplies)+creditCost;
		return total;
	}
	
}
