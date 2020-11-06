package chapter2;

public class DoWhileEx {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		do {
			//sum=sum+num;
			sum+=num; //1
			num++; //2
		}
		while(num<=10);
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
