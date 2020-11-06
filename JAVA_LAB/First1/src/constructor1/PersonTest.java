package constructor1;

public class PersonTest {
	
	public static void main(String[] args) {
		Person personKim =new Person();
		personKim.name="김유신";
		personKim.height=108.0f;
		personKim.weight=85.5f;
		
		
		Person personLee =new Person("이순신",175,75);
		
		
	}

}
