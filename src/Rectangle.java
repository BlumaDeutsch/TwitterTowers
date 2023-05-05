public class Rectangle extends Tower {
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	public Rectangle() {
		super();
	}
	
	private void rectangleArea() {
		int area = width * height;
		System.out.format("The area of the rectangle is %d\n", area);
	}
	
	private void ractanglePerimeter() {
		int perimeter = (width * 2) + (height * 2);
		System.out.format("The perimeter of the rectangle is %d\n", perimeter);
	}
	
	private boolean chekSqr() {
		if(width == height || Math.abs(width - height) > 5) {
			return true;
		}
		return false;
	}
	
	public void printRectangle() {
		if(chekSqr()) {
			rectangleArea();
		}
		else {
			ractanglePerimeter();
		}
	}
}