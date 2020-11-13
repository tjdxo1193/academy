package sort;

import java.util.Random;

public class Bubble_Sort {
	public static final int NUM = 4000;

	public static void main(String[] args) {
		int i, j = 0;

		int[] RandomNum = new int[NUM];

		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < NUM; i++) {
			RandomNum[i] = random.nextInt(100000) + 1;
			for (j = 0; j < i; j++) {
				if (RandomNum[i] == RandomNum[j])
					i--;
			}
		}

		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
		long start = System.currentTimeMillis();
		BubbleSort(RandomNum);
		long endTime = System.currentTimeMillis();
		System.out.println("\n거품정렬 끝. 수행시간 : " + (endTime - start) / 1000.0f + "초");
		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
	}

	public static void BubbleSort(int arr[]) {
		int i, j, temp = 0;
		for (i = NUM - 1; i >= 0; i--) {
			for (j = 0; j < i ; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}

		}

	}

}
