package sort3;

import java.util.Random;

public class Quick_Sort {
	public static final int NUM = 6;
	public static void main(String[] args) {
		int i, j = 0;

		int[] RandomNum = new int[NUM];

		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (i = 0; i < NUM; i++) {
			RandomNum[i] = random.nextInt(45) + 1;
			for (j = 0; j < i; j++) {
				if (RandomNum[i] == RandomNum[j])
					i--;
			}
		}

		System.out.println("[정렬되지 않은 배열]");
		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
		long start = System.currentTimeMillis();
		quickSort(RandomNum);
		long endTime = System.currentTimeMillis();
		System.out.println("\n\n퀵정렬 끝. 수행시간 : " + (endTime - start) / 1000.0f + "초\n");
		System.out.println("[정렬된 배열]");
		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
			
	}
	
	
	public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }
	private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }
	
	
	 private static void swap(int[] arr, int i, int j) {
	        int tmp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = tmp;
	    }

}
