package chapter2;

public class WhileEx1 {

	public static void main(String[] args) {
		int num=1;
		int sum =0;
		
		while(num<=10) {
			sum=sum+num;
			sum+=num;//1,3
			num++;//2,3
		//	System.out.println("1����10������ ���� "+sum+"�Դϴ�."); ��ü�� �ϳ��� ����.
		}
			System.out.println("1����10������ ���� "+sum+"�Դϴ�.");
	}

}