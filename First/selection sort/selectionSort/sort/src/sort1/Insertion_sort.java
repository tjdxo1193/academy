package sort1;

import java.util.Random;

public class Insertion_sort {
	public static final int NUM = 500000;
	public static void main(String[] args) {
		int i, j = 0;

		int[] RandomNum = new int[NUM];

		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < NUM; i++) {
			RandomNum[i] = random.nextInt(1000000) + 1;
			for (j = 0; j < i; j++) {
				if (RandomNum[i] == RandomNum[j])
					i--;
			}
		}
//		System.out.println("[정렬되지 않은 배열]");
//		for (i = 0; i < NUM; i++) {
////			System.out.print("[" + RandomNum[i] + "] ");
//		}
		long start = System.currentTimeMillis();
		InsertionSort(RandomNum);
		long endTime = System.currentTimeMillis();
		System.out.println("\n\n삽입정렬 끝. 수행시간(50만걔) : " + (endTime - start) / 1000.0f + "초\n");
//		System.out.println("[정렬된 배열]");
//		for (i = 0; i < NUM; i++) {
//			System.out.print("[" + RandomNum[i] + "] ");
//		}
	}

	public static void InsertionSort(int arr[]) {
		int i, j, key = 0;
		for (i = 1; i < NUM; i++) {
			key = arr[i];
			for (j = i-1 ; (j >= 0) && (key < arr[j]) ; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1] = key;
		}

	}

}
