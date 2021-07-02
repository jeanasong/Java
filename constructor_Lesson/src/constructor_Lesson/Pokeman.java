package constructor_Lesson;

public class Pokeman {
	String name;
	String type;
	
	public Pokeman(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokeman choke = new Pokeman("Haben", "electric");
		System.out.println("I choose you " + choke.name + " My favorite type is " + choke.type);

	}

}
