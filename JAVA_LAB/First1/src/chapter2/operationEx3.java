package chapter2;

public class operationEx3 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);
	}

}
