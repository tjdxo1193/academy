package leeson6;

public class Example1 {

	public static void main(String args) {
		int sum = 0 , i = 0;
		int sw = 1;
		int count;
		int m = 0;
		for(count = 1 ; count <= 10 ; count ++) {
			i = i+1;
			m = (i*sw); 
			sum = sum+m;
			System.out.printf("count = %2d, i = 2%d, sw = %d, m = %d sum = %3\n", count, i, sw, m, sum);
			sw = -sw;
		}
		System.out.println("-----------반복문 종료-------------");
		System.out.printf("count = %2d, i = %2d, sw = %d, m = %d, sum = %3d\n ", count, i, sw, m, sum);
		
	}
}
