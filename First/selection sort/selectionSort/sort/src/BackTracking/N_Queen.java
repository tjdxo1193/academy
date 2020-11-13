package BackTracking;

import java.util.Scanner;

public class N_Queen {
	static int N;
	static int[] vx = new int[15 + 1];
	static int[] vy = new int[15 + 1];

	public static void main(String[] args) {
		int r = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		for(int i = 0; i < N; i++) r += go(0,i);
		System.out.println(r);
	}

	public static int go(int y, int x) {
		for (int i = 0; i < y; i++) {
			if (y == vy[i])// °¡·Î °ãÄ§
				return 0;
			if (x == vx[i])// ¼¼·Î °ãÄ§
				return 0;
			if (Math.abs(x - vx[i]) == Math.abs(y - vy[i])) // ´ë°¢¼± °ãÄ§
				return 0;
		}
		if (y == N - 1)
			return 1;

		vy[y] = y;
		vx[y] = x;
		int r = 0;
		for (int i = 0; i < N; i++) {
			r += go(y + 1, i);
		}
		return r;
	}
}
