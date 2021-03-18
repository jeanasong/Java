package HomeWork3;


//Below are the instructions


//Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double. The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
//In case the height parameter is less than 0 it needs to set the height field value to 0.
//Write the following methods (instance methods):
//Method named getHeight without any parameters, it needs to return the value of height field.
//Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.



public class Cuboid extends Rectangle {

	private double height;
	
	public Cuboid(double width, double length, double height) {
		// call to the parent class constructor with super keyword
		super(width, length);
		if(height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return height * this.getArea();
	}
	
	@Override
	public String toString() {
		// in JS `Rectangle:{width:${width}, length:${length}}`
		return String.format("Cuboid:{width:%s, length:%s, height:%s}",
				this.getWidth(), this.getLength(), height);
	}
}
