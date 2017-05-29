package Ex10Sheet10Inheritance;

import Ex10Sheet10Inheritance.Shape.Colour;
public class MainForShape {

	public static void main(String[] args) {
		System.out.println("-----Shape class-----");
		Shape p = new Shape(Colour.GREEN);
		System.out.println(p);
		Rectangle r = new Rectangle(Shape.Colour.BLUE, 2.4, 2.5);
		System.out.println(r.getArea());
		System.out.println(r);
		Triangle t = new Triangle(Shape.Colour.PINK);
		System.out.println(t);
		Circle c = new Circle(Shape.Colour.GREY, 12);
		System.out.println(c);
		Rectangle r2 = new Rectangle(Shape.Colour.ORANGE, 3, 4);
		System.out.println(r2.getArea());
		System.out.println(r2);
		Triangle t2 = new Triangle(Shape.Colour.WHITE);
		System.out.println(t2);
		Circle c2 = new Circle(Shape.Colour.YELLOW, 9);
		System.out.println(c2);
		System.out.println("\nArray print out : ");
		Shape [] allShapes = {r,t,c,r2,t2,c2};
		
		for(Shape one: allShapes){
			System.out.println("Colour : " + one.getColour());
		}
		for(Shape one: allShapes){
			if(one instanceof Circle){
				System.out.println("Circle : "+ ((Circle)one).getRadius());
			}
		}
		for(Shape one: allShapes){
			if(one instanceof Rectangle){
				System.out.println("Rectangle : "+ ((Rectangle)one).getArea());
			}
		}

	}

}
