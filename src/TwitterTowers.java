import java.util.*;

public class TwitterTowers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			int numberEntered;
			System.out.print("Enter 1 to select a rectangle shaped tower\n" + "Enter 2 to select a triangle shaped tower\n" + "Enter 3 to exit ");
			try {
				numberEntered = input.nextInt();
			}
			catch (Exception e){
				exit = true;
				continue;
			}
			if (numberEntered == 3) { //exit
				exit = true;
				System.out.print("Thank you for using twitter towers!");
				continue;
			}
			if (numberEntered != 2 && numberEntered != 1) { 
				System.out.print("Wrong input, please try again\n");
				continue;
			}
			Tower tower = createTower(numberEntered, tower = null);
			if(tower instanceof Rectangle) {
				((Rectangle) tower).printRectangle();
			}
			if(tower instanceof Triangle) {
				triangleOptions(tower);
			}
		}

	}
	
	private static void triangleOptions(Tower tower) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1 to calculate the perimeter of the triangle\n" + "Enter 2 to print the triangle ");
		int choise = input.nextInt();
		if(choise == 1) {
			((Triangle) tower).trianglePerimeter();
		}
		else if(choise == 2) {
			((Triangle) tower).printTriangle();
		}
	}

	private static Tower createTower(int number, Tower tower) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter width: ");
		int width = input.nextInt();
		System.out.print("Please enter height: ");
		int height = input.nextInt();
		if(number == 1) {
			tower = new Rectangle(width, height);
		}
		else if(number == 2) {
			tower = new Triangle(width, height);
		}
		return tower;
	}
}
