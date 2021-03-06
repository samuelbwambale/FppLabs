package lab4_inheritance_and_polymorphism.prog4_5_closedCurve3;


public class Test3 {
	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4,5,6), new Square(3), new Rectangle(3, 4) };

		for (Polygon cc : objects) {
			String nameOfCurve = cc.getClass().getSimpleName();
			System.out.println("For this " + nameOfCurve);
			System.out.println("  Number of sides = " + cc.getNumberOfSides());
			System.out.println("  Perimeter =  " + cc.computePerimeter());

		}
	}

}
