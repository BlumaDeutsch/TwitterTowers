public class Triangle extends Tower{
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	public Triangle() {
		super();
	}
	
	public void trianglePerimeter() {
		double perimeter = Math.hypot(width / 2, height) * 2 + width;
		System.out.format("The perimeter of the triangle is %f\n", perimeter);
	}
	
	private boolean canBePrinted() {
		if (width % 2 == 0 || width > height * 2) {
			System.out.println("The triangle cannot be printed");
			return false;
		}
		return true;
	}
	
	public void printTriangle() {
		if (canBePrinted()) {
			int numOfLines = (height - 2) / ((width - 3) / 2);
			int numOfSecondLine = (height - 2) % ((width - 3) / 2);
			for(int i = 0; i < (width - 1) / 2; ++i) {
				System.out.print(" ");
			}
			System.out.println("*");
			int last = 1;				
			for(int i = 0; i < numOfSecondLine; ++i) {
				for(int l = 0; l < (width - (last + 2)) / 2; ++l) {
					System.out.print(" ");
				}
				for(int j = 0; j < last + 2; ++j) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			for(int k = 0; k < ((width - 3) / 2); ++k) {

				for(int i = 0; i < numOfLines; ++i) {
					for(int l = 0; l < (width - (last + 2)) / 2; ++l) {
						System.out.print(" ");
					}
					for(int j = 0; j < last + 2; ++j) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				last += 2;
			}
			for(int i = 0; i < width; ++i) {
				System.out.print("*");
			}
			System.out.print("\n");
			
			
		}
	}
}


