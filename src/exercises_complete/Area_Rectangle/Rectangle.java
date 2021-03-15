package exercises_complete.Area_Rectangle;


public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2*(width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA = "
			+ Area()
			+ String.format("%n", "F")
			+ "PERIMETER = "
			+ Perimeter()
			+ String.format("%n", "F")
			+ "DIAGONAL = "
			+ Diagonal();
	}
	

}
