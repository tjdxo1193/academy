import java.util.Random;

public class test {
	
	// insert sort 삽입 정렬 로또 난수 함수 O(n제곱)
	public static void main(String args[]) {
		
		int RandomNum[] = new int[7];
		int i, j;
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < 7; i++) {
			RandomNum[i] = random.nextInt(45)+1;
			for(j=0; j < i; j++) {
				if(RandomNum[i] == RandomNum[j])
					i--;
			}
		}
		
		for (i = 0; i <= 6; i++) {
			System.out.println("[" + RandomNum[i] + "]");
		}
		
		for (int i1 = 1; i1 < 7; i1++) {
            for (int j1 = i1; j1 > 0; j1--) {
                if (RandomNum[j1 - 1] > RandomNum[j1])
                    swap(RandomNum, j1 - 1, j1);
            }
		}
		
		for (i = 0; i <= 6; i++) {
			System.out.println("[" + RandomNum[i] + "]");
		}
	}

	 private static void swap(int[] arr, int a, int b) {
	        int tmp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = tmp;
		}
		
}
