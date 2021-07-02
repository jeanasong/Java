package constructor_Lesson;

public class Car {
	String name;
	String color;
	
	public Car(String name, String color) {
		this.name =name;
		this.color = "white";
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jeep = new Car("Toyota", "black");
		System.out.println(jeep.color);

	}

}
