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
		System.out.println("1���� 10������ ���� "+sum+"�Դϴ�.");
	}

}
