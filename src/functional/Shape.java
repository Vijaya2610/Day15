package functional;

public class Shape {
	public void calculateArea(Area sides) {
		sides.calculateArea(4);
	}
	public static void main(String[] args) {
         Shape shape = new Shape();
            shape.calculateArea((sides) -> {
            int area = sides * sides;
            System.out.println("Area: " + area);
        });
	}
}