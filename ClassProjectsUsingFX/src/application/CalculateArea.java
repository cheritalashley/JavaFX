package application;

public class CalculateArea {
	
	static double circleArea(String text1) {
		double cArea = 3.14*((Integer.parseInt(text1))*(Integer.parseInt(text1)));
		return cArea;
	}

	static double triangleArea(String text2, String text3) {
		double tArea=((Integer.parseInt(text2))*(Integer.parseInt(text3)))/2;
		return tArea;
	}
	
	static double squareArea(String text4) {
		double tArea=Integer.parseInt(text4)*Integer.parseInt(text4);
		return tArea;
	}
	
}
