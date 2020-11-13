package sort4;

import java.util.ArrayList;
import java.util.Random;

// max heap!
public class HeapSort {
    static ArrayList<Integer> sortArr = new ArrayList<>();
    static int[] swap(int[] a, int m, int n){
        int tmp = 0;

        tmp = a[m];
        a[m] = a[n];
        a[n] = tmp;

        return a;
    }

    static int[] maxHeapify(int[] a){
        int start = a.length/2;
        for(int i=start; i>=1; i--){
            //System.out.println(2*i + " " + (2*i+1));
            if(2*i < a.length && a[i] <= a[2*i]) { a = swap(a, i, 2*i); }
            if((2*i)+1 < a.length && a[i] <= a[(2*i)+1]) {
                a = swap(a, i, (2*i)+1);
            }
        }
        return a;
    }

    static int[] exchange_1_n(int[] a){
        int arrLength = a.length-1;

        a = swap(a, 1, arrLength);
        sortArr.add(a[arrLength]);

        int[] noneMaxHeap = new int[arrLength];

        for(int i=1; i<arrLength; i++){
            noneMaxHeap[i] = a[i];
        }

        return noneMaxHeap;
    }
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

		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
		long start = System.currentTimeMillis();
		 for(int k=0; k<NUM; k++){
			 RandomNum = maxHeapify(RandomNum);
			 RandomNum = exchange_1_n(RandomNum);
	        }
		long endTime = System.currentTimeMillis();
		System.out.println("\n힙정렬 끝. 수행시간 : " + (endTime - start) / 1000.0f + "초");
		for (i = 0; i < NUM; i++) {
			System.out.print("[" + RandomNum[i] + "] ");
		}
    }
}