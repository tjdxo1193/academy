package sort2;
import java.util.Random;

public class Merge_Sort {
	public static final int NUM = 5000000;
	static int[] TEMP = new int[NUM];
	public static void main(String[] args) {
		int i, j = 0;
		int[] RandomNum = new int[NUM];
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < NUM; i++) {
			RandomNum[i] = random.nextInt(100000000) + 1;
			for (j = 0; j < i; j++) {
				if (RandomNum[i] == RandomNum[j])
					i--;
			}
		}
//		System.out.println("[정렬되지 않은 배열]");
//		for (i = 0; i < NUM; i++) {
//			System.out.print("[" + RandomNum[i] + "] ");
//		}
		long start = System.currentTimeMillis();
		mergeSort(RandomNum, 0, NUM - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("\n\n합병정렬 끝. 수행시간(500만개) : " + (endTime - start) / 1000.0f + "초\n");
//		System.out.println("[정렬된 배열]");
//		for (i = 0; i < NUM; i++) {
//			System.out.print("[" + RandomNum[i] + "] ");
//		}
	}

	
	public static void merge(int arg[], int Start, int Mid, int End) {
		int fps1 = Start;
		int fps2 = Mid+1;
		int pos = Start;
		
		while(fps1 <= Mid && fps2 <= End) {
			if(arg[fps1] <= arg[fps2]) {
				TEMP[pos] = arg[fps1];
				fps1++;
			}else {
				TEMP[pos] = arg[fps2];
				fps2++;
			}
			pos++;
		}
		
		if(fps1 > Mid) {
			for(int i = fps2; i <= End ; i++ , pos++)
				TEMP[pos] = arg[i];
		}else {
			for(int i = fps1; i <= Mid ; i++ , pos++)
				TEMP[pos] = arg[i];
		}

		for(int i = Start;i<=End;i++)
			arg[i] = TEMP[i];
			
			
	}
	public static void mergeSort(int arg[], int Start, int End) {
		int mid = 0;
		if(Start < End) {
			mid = (Start + End) / 2 ;
			mergeSort(arg, Start, mid);
			mergeSort(arg, mid+1, End);
			merge(arg, Start, mid, End);
		}
	}
}