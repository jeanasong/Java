package constructor_Lesson;

public class Animal {
	String name;
	String voice;
	
	public Animal(String name, String voice) {
		this.name = name;
		this.voice = voice;
	}
	
	public void talk() {
		System.err.println(this.voice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal("Velez", "moes");
		Animal dog = new Animal("Jade", "woof");
		cat.talk();
		dog.talk();

	}

}
