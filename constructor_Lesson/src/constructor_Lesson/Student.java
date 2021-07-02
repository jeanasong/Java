package constructor_Lesson;

public class Student {
	// declare our instance variable
	int age;
	String name;
	String hobby;
	
	public Student(int age, String name, String hobby) {
		this.age = age;
		this.name = name;
		this.hobby = hobby;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jean = new Student(30, "Jean Baptiste", "Sport");
		System.out.println(jean.hobby);
		
	}
}